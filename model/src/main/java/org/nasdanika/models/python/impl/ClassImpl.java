/**
 */
package org.nasdanika.models.python.impl;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.python.PythonPackage;
import org.nasdanika.models.source.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.python.impl.ClassImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.models.python.impl.ClassImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link org.nasdanika.models.python.impl.ClassImpl#getDecorators <em>Decorators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends NamedElementImpl implements org.nasdanika.models.python.Class {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Source> getBody() {
		return (EList<Source>)eDynamicGet(PythonPackage.CLASS__BODY, PythonPackage.Literals.CLASS__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getParents() {
		return (EList<String>)eDynamicGet(PythonPackage.CLASS__PARENTS, PythonPackage.Literals.CLASS__PARENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getDecorators() {
		return (EList<String>)eDynamicGet(PythonPackage.CLASS__DECORATORS, PythonPackage.Literals.CLASS__DECORATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PythonPackage.CLASS__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PythonPackage.CLASS__BODY:
				return getBody();
			case PythonPackage.CLASS__PARENTS:
				return getParents();
			case PythonPackage.CLASS__DECORATORS:
				return getDecorators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PythonPackage.CLASS__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Source>)newValue);
				return;
			case PythonPackage.CLASS__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends String>)newValue);
				return;
			case PythonPackage.CLASS__DECORATORS:
				getDecorators().clear();
				getDecorators().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PythonPackage.CLASS__BODY:
				getBody().clear();
				return;
			case PythonPackage.CLASS__PARENTS:
				getParents().clear();
				return;
			case PythonPackage.CLASS__DECORATORS:
				getDecorators().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PythonPackage.CLASS__BODY:
				return !getBody().isEmpty();
			case PythonPackage.CLASS__PARENTS:
				return !getParents().isEmpty();
			case PythonPackage.CLASS__DECORATORS:
				return !getDecorators().isEmpty();
		}
		return super.eIsSet(featureID);
	}
		
	/**
	 * Generates a list of sources from contents.
	 * When merging, source ranges are used to replace fragments in the original source.
	 * @param tokenSource
	 * @return
	 */
	@Override
	protected List<org.nasdanika.models.source.Source> generateContents(Function<String, String> tokenSource, int indent) {
		List<org.nasdanika.models.source.Source> contents = super.generateContents(null, indent); // Import manager?
		for (String decorator: getDecorators()) {
			contents.add(org.nasdanika.models.source.Source.create(indent(indent) + "@" + decorator + System.lineSeparator()));			
		}
		
		StringBuilder headerBuilder = indent(indent);
		headerBuilder.append("class ").append(getName());
		EList<String> parents = getParents();
		for (int i = 0; i < parents.size(); ++i) {
			if (i == 0) {
				headerBuilder.append("(");
			} else {
				headerBuilder.append(", ");
			}
			headerBuilder.append(parents.get(i));
			if (i == parents.size() - 1) {
				headerBuilder.append(")");
			}
		}
		headerBuilder
			.append(":")
			.append(System.lineSeparator());
		
		contents.add(org.nasdanika.models.source.Source.create(headerBuilder));

		for (Source bodyElement: getBody()) {
			String bodyElementSource = bodyElement.generate(null, indent + 1);
			contents.add(org.nasdanika.models.source.Source.create(bodyElementSource, bodyElement));
		}
		
		return contents;
	}		

} //ClassImpl
