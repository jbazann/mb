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
import unifilar290922.Generator;
import unifilar290922.GeneratorBusAssociation;
import unifilar290922.Unifilar290922Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Bus Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unifilar290922.impl.GeneratorBusAssociationImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link unifilar290922.impl.GeneratorBusAssociationImpl#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorBusAssociationImpl extends MinimalEObjectImpl.Container implements GeneratorBusAssociation {
	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected Generator generator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorBusAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Unifilar290922Package.Literals.GENERATOR_BUS_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator getGenerator() {
		if (generator != null && generator.eIsProxy()) {
			InternalEObject oldGenerator = (InternalEObject) generator;
			generator = (Generator) eResolveProxy(oldGenerator);
			if (generator != oldGenerator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__GENERATOR, oldGenerator, generator));
			}
		}
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator basicGetGenerator() {
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerator(Generator newGenerator, NotificationChain msgs) {
		Generator oldGenerator = generator;
		generator = newGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__GENERATOR, oldGenerator, newGenerator);
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
	public void setGenerator(Generator newGenerator) {
		if (newGenerator != generator) {
			NotificationChain msgs = null;
			if (generator != null)
				msgs = ((InternalEObject) generator).eInverseRemove(this,
						Unifilar290922Package.GENERATOR__GENERATOR_BUS_ASSOCIATION, Generator.class, msgs);
			if (newGenerator != null)
				msgs = ((InternalEObject) newGenerator).eInverseAdd(this,
						Unifilar290922Package.GENERATOR__GENERATOR_BUS_ASSOCIATION, Generator.class, msgs);
			msgs = basicSetGenerator(newGenerator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__GENERATOR, newGenerator, newGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus getBus() {
		if (eContainerFeatureID() != Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__BUS)
			return null;
		return (Bus) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBus(Bus newBus, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newBus, Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__BUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBus(Bus newBus) {
		if (newBus != eInternalContainer()
				|| (eContainerFeatureID() != Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__BUS && newBus != null)) {
			if (EcoreUtil.isAncestor(this, newBus))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBus != null)
				msgs = ((InternalEObject) newBus).eInverseAdd(this,
						Unifilar290922Package.BUS__GENERATOR_BUS_ASSOCIATION, Bus.class, msgs);
			msgs = basicSetBus(newBus, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__BUS,
					newBus, newBus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__GENERATOR:
			if (generator != null)
				msgs = ((InternalEObject) generator).eInverseRemove(this,
						Unifilar290922Package.GENERATOR__GENERATOR_BUS_ASSOCIATION, Generator.class, msgs);
			return basicSetGenerator((Generator) otherEnd, msgs);
		case Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__BUS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetBus((Bus) otherEnd, msgs);
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
		case Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__GENERATOR:
			return basicSetGenerator(null, msgs);
		case Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__BUS:
			return basicSetBus(null, msgs);
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
		case Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__BUS:
			return eInternalContainer().eInverseRemove(this, Unifilar290922Package.BUS__GENERATOR_BUS_ASSOCIATION,
					Bus.class, msgs);
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
		case Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__GENERATOR:
			if (resolve)
				return getGenerator();
			return basicGetGenerator();
		case Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__BUS:
			return getBus();
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
		case Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__GENERATOR:
			setGenerator((Generator) newValue);
			return;
		case Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__BUS:
			setBus((Bus) newValue);
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
		case Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__GENERATOR:
			setGenerator((Generator) null);
			return;
		case Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__BUS:
			setBus((Bus) null);
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
		case Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__GENERATOR:
			return generator != null;
		case Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__BUS:
			return getBus() != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneratorBusAssociationImpl
