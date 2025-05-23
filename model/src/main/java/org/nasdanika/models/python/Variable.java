/**
 */
package org.nasdanika.models.python;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.python.Variable#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.python.PythonPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.nasdanika.models.python.PythonPackage#getVariable_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.python.Variable#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);
	
	static Variable createVariable(String name, String expression) {
		Variable ret = PythonFactory.eINSTANCE.createVariable();
		ret.setName(name);
		ret.setExpression(expression);
		return ret;
	}
	
} // Variable
