/**
 */
package org.nasdanika.models.python.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.python.Import;
import org.nasdanika.models.python.PythonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.python.impl.ImportImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.nasdanika.models.python.impl.ImportImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.nasdanika.models.python.impl.ImportImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.nasdanika.models.python.impl.ImportImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends MinimalEObjectImpl.Container implements Import {
	/**
	 * The default value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getItem() <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonPackage.Literals.IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModule() {
		return (String)eDynamicGet(PythonPackage.IMPORT__MODULE, PythonPackage.Literals.IMPORT__MODULE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModule(String newModule) {
		eDynamicSet(PythonPackage.IMPORT__MODULE, PythonPackage.Literals.IMPORT__MODULE, newModule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlias() {
		return (String)eDynamicGet(PythonPackage.IMPORT__ALIAS, PythonPackage.Literals.IMPORT__ALIAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlias(String newAlias) {
		eDynamicSet(PythonPackage.IMPORT__ALIAS, PythonPackage.Literals.IMPORT__ALIAS, newAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItem() {
		return (String)eDynamicGet(PythonPackage.IMPORT__ITEM, PythonPackage.Literals.IMPORT__ITEM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItem(String newItem) {
		eDynamicSet(PythonPackage.IMPORT__ITEM, PythonPackage.Literals.IMPORT__ITEM, newItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(PythonPackage.IMPORT__NAME, PythonPackage.Literals.IMPORT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(PythonPackage.IMPORT__NAME, PythonPackage.Literals.IMPORT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PythonPackage.IMPORT__MODULE:
				return getModule();
			case PythonPackage.IMPORT__ALIAS:
				return getAlias();
			case PythonPackage.IMPORT__ITEM:
				return getItem();
			case PythonPackage.IMPORT__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PythonPackage.IMPORT__MODULE:
				setModule((String)newValue);
				return;
			case PythonPackage.IMPORT__ALIAS:
				setAlias((String)newValue);
				return;
			case PythonPackage.IMPORT__ITEM:
				setItem((String)newValue);
				return;
			case PythonPackage.IMPORT__NAME:
				setName((String)newValue);
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
			case PythonPackage.IMPORT__MODULE:
				setModule(MODULE_EDEFAULT);
				return;
			case PythonPackage.IMPORT__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case PythonPackage.IMPORT__ITEM:
				setItem(ITEM_EDEFAULT);
				return;
			case PythonPackage.IMPORT__NAME:
				setName(NAME_EDEFAULT);
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
			case PythonPackage.IMPORT__MODULE:
				return MODULE_EDEFAULT == null ? getModule() != null : !MODULE_EDEFAULT.equals(getModule());
			case PythonPackage.IMPORT__ALIAS:
				return ALIAS_EDEFAULT == null ? getAlias() != null : !ALIAS_EDEFAULT.equals(getAlias());
			case PythonPackage.IMPORT__ITEM:
				return ITEM_EDEFAULT == null ? getItem() != null : !ITEM_EDEFAULT.equals(getItem());
			case PythonPackage.IMPORT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		}
		return super.eIsSet(featureID);
	}

} //ImportImpl
