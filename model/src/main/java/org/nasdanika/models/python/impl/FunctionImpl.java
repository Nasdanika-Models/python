/**
 */
package org.nasdanika.models.python.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Util;
import org.nasdanika.models.python.Function;
import org.nasdanika.models.python.PythonPackage;
import org.nasdanika.models.source.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.python.impl.FunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.models.python.impl.FunctionImpl#getDecorators <em>Decorators</em>}</li>
 *   <li>{@link org.nasdanika.models.python.impl.FunctionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.nasdanika.models.python.impl.FunctionImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends NamedElementImpl implements Function {
	/**
	 * The default value of the '{@link #getAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getParameters() {
		return (EList<String>)eDynamicGet(PythonPackage.FUNCTION__PARAMETERS, PythonPackage.Literals.FUNCTION__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getDecorators() {
		return (EList<String>)eDynamicGet(PythonPackage.FUNCTION__DECORATORS, PythonPackage.Literals.FUNCTION__DECORATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnnotation() {
		return (String)eDynamicGet(PythonPackage.FUNCTION__ANNOTATION, PythonPackage.Literals.FUNCTION__ANNOTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotation(String newAnnotation) {
		eDynamicSet(PythonPackage.FUNCTION__ANNOTATION, PythonPackage.Literals.FUNCTION__ANNOTATION, newAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Source> getBody() {
		return (EList<Source>)eDynamicGet(PythonPackage.FUNCTION__BODY, PythonPackage.Literals.FUNCTION__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PythonPackage.FUNCTION__BODY:
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
			case PythonPackage.FUNCTION__PARAMETERS:
				return getParameters();
			case PythonPackage.FUNCTION__DECORATORS:
				return getDecorators();
			case PythonPackage.FUNCTION__ANNOTATION:
				return getAnnotation();
			case PythonPackage.FUNCTION__BODY:
				return getBody();
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
			case PythonPackage.FUNCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
				return;
			case PythonPackage.FUNCTION__DECORATORS:
				getDecorators().clear();
				getDecorators().addAll((Collection<? extends String>)newValue);
				return;
			case PythonPackage.FUNCTION__ANNOTATION:
				setAnnotation((String)newValue);
				return;
			case PythonPackage.FUNCTION__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Source>)newValue);
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
			case PythonPackage.FUNCTION__PARAMETERS:
				getParameters().clear();
				return;
			case PythonPackage.FUNCTION__DECORATORS:
				getDecorators().clear();
				return;
			case PythonPackage.FUNCTION__ANNOTATION:
				setAnnotation(ANNOTATION_EDEFAULT);
				return;
			case PythonPackage.FUNCTION__BODY:
				getBody().clear();
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
			case PythonPackage.FUNCTION__PARAMETERS:
				return !getParameters().isEmpty();
			case PythonPackage.FUNCTION__DECORATORS:
				return !getDecorators().isEmpty();
			case PythonPackage.FUNCTION__ANNOTATION:
				return ANNOTATION_EDEFAULT == null ? getAnnotation() != null : !ANNOTATION_EDEFAULT.equals(getAnnotation());
			case PythonPackage.FUNCTION__BODY:
				return !getBody().isEmpty();
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
	protected List<org.nasdanika.models.source.Source> generateContents(java.util.function.Function<String, String> tokenSource, int indent) {
		List<org.nasdanika.models.source.Source> contents = super.generateContents(null, indent); // Import manager?
		for (String decorator: getDecorators()) {
			contents.add(org.nasdanika.models.source.Source.create(indent(indent) + "@" + decorator + System.lineSeparator()));			
		}
		
		StringBuilder headerBuilder = indent(indent);
		headerBuilder.append("def ").append(getName());
		EList<String> parameters = getParameters();
		for (int i = 0; i < parameters.size(); ++i) {
			if (i == 0) {
				headerBuilder.append("(");
			} else {
				headerBuilder.append(", ");
			}
			headerBuilder.append(parameters.get(i));
			if (i == parameters.size() - 1) {
				headerBuilder.append(")");
			}
		}
		String annotation = getAnnotation();
		if (!Util.isBlank(annotation)) {
			headerBuilder
				.append(" -> ")
				.append(annotation);
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
	

} //FunctionImpl
