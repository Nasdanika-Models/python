/**
 */
package org.nasdanika.models.python;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.models.source.Source;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.python.Function#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.models.python.Function#getDecorators <em>Decorators</em>}</li>
 *   <li>{@link org.nasdanika.models.python.Function#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.nasdanika.models.python.Function#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.python.PythonPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see org.nasdanika.models.python.PythonPackage#getFunction_Parameters()
	 * @model
	 * @generated
	 */
	EList<String> getParameters();

	/**
	 * Returns the value of the '<em><b>Decorators</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorators</em>' attribute list.
	 * @see org.nasdanika.models.python.PythonPackage#getFunction_Decorators()
	 * @model
	 * @generated
	 */
	EList<String> getDecorators();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' attribute.
	 * @see #setAnnotation(String)
	 * @see org.nasdanika.models.python.PythonPackage#getFunction_Annotation()
	 * @model
	 * @generated
	 */
	String getAnnotation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.python.Function#getAnnotation <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' attribute.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.source.Source}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see org.nasdanika.models.python.PythonPackage#getFunction_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getBody();

} // Function
