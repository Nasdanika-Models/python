/**
 */
package org.nasdanika.models.python;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.models.source.Source;


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
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.source.Source}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see org.nasdanika.models.python.PythonPackage#getVariable_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getExpression();
} // Variable
