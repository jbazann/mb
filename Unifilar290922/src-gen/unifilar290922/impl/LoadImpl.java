/**
 */
package unifilar290922.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import unifilar290922.Load;
import unifilar290922.LoadBusAssociation;
import unifilar290922.Unifilar290922Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unifilar290922.impl.LoadImpl#getLoadBusAssociation <em>Load Bus Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadImpl extends MinimalEObjectImpl.Container implements Load {
	/**
	 * The cached value of the '{@link #getLoadBusAssociation() <em>Load Bus Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBusAssociation()
	 * @generated
	 * @ordered
	 */
	protected LoadBusAssociation loadBusAssociation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Unifilar290922Package.Literals.LOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBusAssociation getLoadBusAssociation() {
		if (loadBusAssociation != null && loadBusAssociation.eIsProxy()) {
			InternalEObject oldLoadBusAssociation = (InternalEObject) loadBusAssociation;
			loadBusAssociation = (LoadBusAssociation) eResolveProxy(oldLoadBusAssociation);
			if (loadBusAssociation != oldLoadBusAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Unifilar290922Package.LOAD__LOAD_BUS_ASSOCIATION, oldLoadBusAssociation,
							loadBusAssociation));
			}
		}
		return loadBusAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBusAssociation basicGetLoadBusAssociation() {
		return loadBusAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadBusAssociation(LoadBusAssociation newLoadBusAssociation,
			NotificationChain msgs) {
		LoadBusAssociation oldLoadBusAssociation = loadBusAssociation;
		loadBusAssociation = newLoadBusAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Unifilar290922Package.LOAD__LOAD_BUS_ASSOCIATION, oldLoadBusAssociation, newLoadBusAssociation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadBusAssociation(LoadBusAssociation newLoadBusAssociation) {
		if (newLoadBusAssociation != loadBusAssociation) {
			NotificationChain msgs = null;
			if (loadBusAssociation != null)
				msgs = ((InternalEObject) loadBusAssociation).eInverseRemove(this,
						Unifilar290922Package.LOAD_BUS_ASSOCIATION__LOAD, LoadBusAssociation.class, msgs);
			if (newLoadBusAssociation != null)
				msgs = ((InternalEObject) newLoadBusAssociation).eInverseAdd(this,
						Unifilar290922Package.LOAD_BUS_ASSOCIATION__LOAD, LoadBusAssociation.class, msgs);
			msgs = basicSetLoadBusAssociation(newLoadBusAssociation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Unifilar290922Package.LOAD__LOAD_BUS_ASSOCIATION,
					newLoadBusAssociation, newLoadBusAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Unifilar290922Package.LOAD__LOAD_BUS_ASSOCIATION:
			if (loadBusAssociation != null)
				msgs = ((InternalEObject) loadBusAssociation).eInverseRemove(this,
						Unifilar290922Package.LOAD_BUS_ASSOCIATION__LOAD, LoadBusAssociation.class, msgs);
			return basicSetLoadBusAssociation((LoadBusAssociation) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Unifilar290922Package.LOAD__LOAD_BUS_ASSOCIATION:
			return basicSetLoadBusAssociation(null, msgs);
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
		case Unifilar290922Package.LOAD__LOAD_BUS_ASSOCIATION:
			if (resolve)
				return getLoadBusAssociation();
			return basicGetLoadBusAssociation();
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
		case Unifilar290922Package.LOAD__LOAD_BUS_ASSOCIATION:
			setLoadBusAssociation((LoadBusAssociation) newValue);
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
		case Unifilar290922Package.LOAD__LOAD_BUS_ASSOCIATION:
			setLoadBusAssociation((LoadBusAssociation) null);
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
		case Unifilar290922Package.LOAD__LOAD_BUS_ASSOCIATION:
			return loadBusAssociation != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadImpl
