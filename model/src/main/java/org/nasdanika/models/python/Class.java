/**
 */
package org.nasdanika.models.python;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.models.source.Source;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.python.Class#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.models.python.Class#getParents <em>Parents</em>}</li>
 *   <li>{@link org.nasdanika.models.python.Class#getDecorators <em>Decorators</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.python.PythonPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.source.Source}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see org.nasdanika.models.python.PythonPackage#getClass_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getBody();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' attribute list.
	 * @see org.nasdanika.models.python.PythonPackage#getClass_Parents()
	 * @model
	 * @generated
	 */
	EList<String> getParents();

	/**
	 * Returns the value of the '<em><b>Decorators</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorators</em>' attribute list.
	 * @see org.nasdanika.models.python.PythonPackage#getClass_Decorators()
	 * @model
	 * @generated
	 */
	EList<String> getDecorators();

} // Class
