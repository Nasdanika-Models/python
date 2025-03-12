/**
 */
package org.nasdanika.models.python;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.python.Source#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.python.PythonPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends org.nasdanika.models.source.Source {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.python.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.nasdanika.models.python.PythonPackage#getSource_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // Source
