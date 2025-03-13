/**
 */
package org.nasdanika.models.python;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.python.Import#getModule <em>Module</em>}</li>
 *   <li>{@link org.nasdanika.models.python.Import#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.nasdanika.models.python.Import#getItem <em>Item</em>}</li>
 *   <li>{@link org.nasdanika.models.python.Import#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.python.PythonPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' attribute.
	 * @see #setModule(String)
	 * @see org.nasdanika.models.python.PythonPackage#getImport_Module()
	 * @model
	 * @generated
	 */
	String getModule();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.python.Import#getModule <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' attribute.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.nasdanika.models.python.PythonPackage#getImport_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.python.Import#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' attribute.
	 * @see #setItem(String)
	 * @see org.nasdanika.models.python.PythonPackage#getImport_Item()
	 * @model
	 * @generated
	 */
	String getItem();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.python.Import#getItem <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' attribute.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.python.PythonPackage#getImport_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.python.Import#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	
	static Import createModuleImport(String moduleName) {
		Import ret = PythonFactory.eINSTANCE.createImport();
		ret.setModule(moduleName);
		return ret;
	}
	
	static Import createModuleImport(String moduleName, String alias) {
		Import ret = createModuleImport(moduleName);
		ret.setAlias(alias);
		return ret;
	}
		
	static Import createItemImport(String moduleName, String item) {
		Import ret = createModuleImport(moduleName);
		ret.setItem(item);
		return ret;
	}
		
	static Import createItemImport(String moduleName, String item, String name) {
		Import ret = createItemImport(moduleName, item);
		ret.setName(name);
		return ret;
	}		

} // Import
