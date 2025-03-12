/**
 */
package org.nasdanika.models.python.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.python.PythonPackage;
import org.nasdanika.models.python.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.python.impl.VariableImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends NamedElementImpl implements Variable {
	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public String getExpression() {
		return (String)eDynamicGet(PythonPackage.VARIABLE__EXPRESSION, PythonPackage.Literals.VARIABLE__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(String newExpression) {
		eDynamicSet(PythonPackage.VARIABLE__EXPRESSION, PythonPackage.Literals.VARIABLE__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PythonPackage.VARIABLE__EXPRESSION:
				return getExpression();
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
			case PythonPackage.VARIABLE__EXPRESSION:
				setExpression((String)newValue);
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
			case PythonPackage.VARIABLE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
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
			case PythonPackage.VARIABLE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? getExpression() != null : !EXPRESSION_EDEFAULT.equals(getExpression());
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
		
		StringBuilder builder = indent(indent);
		builder
			.append(getName())
			.append(" = ")
			.append(getExpression())
			.append(System.lineSeparator());
		
		contents.add(org.nasdanika.models.source.Source.create(builder));
		return contents;
	}			
	

} //VariableImpl
