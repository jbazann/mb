/**
 */
package unifilar290922.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import unifilar290922.Bus;
import unifilar290922.Load;
import unifilar290922.LoadBusAssociation;
import unifilar290922.Unifilar290922Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Bus Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unifilar290922.impl.LoadBusAssociationImpl#getBus <em>Bus</em>}</li>
 *   <li>{@link unifilar290922.impl.LoadBusAssociationImpl#getLoad <em>Load</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadBusAssociationImpl extends MinimalEObjectImpl.Container implements LoadBusAssociation {
	/**
	 * The cached value of the '{@link #getLoad() <em>Load</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected Load load;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBusAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Unifilar290922Package.Literals.LOAD_BUS_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus getBus() {
		if (eContainerFeatureID() != Unifilar290922Package.LOAD_BUS_ASSOCIATION__BUS)
			return null;
		return (Bus) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBus(Bus newBus, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newBus, Unifilar290922Package.LOAD_BUS_ASSOCIATION__BUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBus(Bus newBus) {
		if (newBus != eInternalContainer()
				|| (eContainerFeatureID() != Unifilar290922Package.LOAD_BUS_ASSOCIATION__BUS && newBus != null)) {
			if (EcoreUtil.isAncestor(this, newBus))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBus != null)
				msgs = ((InternalEObject) newBus).eInverseAdd(this, Unifilar290922Package.BUS__LOAD_BUS_ASSOCIATION,
						Bus.class, msgs);
			msgs = basicSetBus(newBus, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Unifilar290922Package.LOAD_BUS_ASSOCIATION__BUS,
					newBus, newBus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Load getLoad() {
		if (load != null && load.eIsProxy()) {
			InternalEObject oldLoad = (InternalEObject) load;
			load = (Load) eResolveProxy(oldLoad);
			if (load != oldLoad) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Unifilar290922Package.LOAD_BUS_ASSOCIATION__LOAD, oldLoad, load));
			}
		}
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Load basicGetLoad() {
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoad(Load newLoad, NotificationChain msgs) {
		Load oldLoad = load;
		load = newLoad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Unifilar290922Package.LOAD_BUS_ASSOCIATION__LOAD, oldLoad, newLoad);
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
	public void setLoad(Load newLoad) {
		if (newLoad != load) {
			NotificationChain msgs = null;
			if (load != null)
				msgs = ((InternalEObject) load).eInverseRemove(this, Unifilar290922Package.LOAD__LOAD_BUS_ASSOCIATION,
						Load.class, msgs);
			if (newLoad != null)
				msgs = ((InternalEObject) newLoad).eInverseAdd(this, Unifilar290922Package.LOAD__LOAD_BUS_ASSOCIATION,
						Load.class, msgs);
			msgs = basicSetLoad(newLoad, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Unifilar290922Package.LOAD_BUS_ASSOCIATION__LOAD,
					newLoad, newLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Unifilar290922Package.LOAD_BUS_ASSOCIATION__BUS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetBus((Bus) otherEnd, msgs);
		case Unifilar290922Package.LOAD_BUS_ASSOCIATION__LOAD:
			if (load != null)
				msgs = ((InternalEObject) load).eInverseRemove(this, Unifilar290922Package.LOAD__LOAD_BUS_ASSOCIATION,
						Load.class, msgs);
			return basicSetLoad((Load) otherEnd, msgs);
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
		case Unifilar290922Package.LOAD_BUS_ASSOCIATION__BUS:
			return basicSetBus(null, msgs);
		case Unifilar290922Package.LOAD_BUS_ASSOCIATION__LOAD:
			return basicSetLoad(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case Unifilar290922Package.LOAD_BUS_ASSOCIATION__BUS:
			return eInternalContainer().eInverseRemove(this, Unifilar290922Package.BUS__LOAD_BUS_ASSOCIATION, Bus.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Unifilar290922Package.LOAD_BUS_ASSOCIATION__BUS:
			return getBus();
		case Unifilar290922Package.LOAD_BUS_ASSOCIATION__LOAD:
			if (resolve)
				return getLoad();
			return basicGetLoad();
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
		case Unifilar290922Package.LOAD_BUS_ASSOCIATION__BUS:
			setBus((Bus) newValue);
			return;
		case Unifilar290922Package.LOAD_BUS_ASSOCIATION__LOAD:
			setLoad((Load) newValue);
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
		case Unifilar290922Package.LOAD_BUS_ASSOCIATION__BUS:
			setBus((Bus) null);
			return;
		case Unifilar290922Package.LOAD_BUS_ASSOCIATION__LOAD:
			setLoad((Load) null);
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
		case Unifilar290922Package.LOAD_BUS_ASSOCIATION__BUS:
			return getBus() != null;
		case Unifilar290922Package.LOAD_BUS_ASSOCIATION__LOAD:
			return load != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadBusAssociationImpl
