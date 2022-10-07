/**
 */
package unifilar290922.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import unifilar290922.Generator;
import unifilar290922.GeneratorBusAssociation;
import unifilar290922.Unifilar290922Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unifilar290922.impl.GeneratorImpl#getGeneratorBusAssociation <em>Generator Bus Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorImpl extends MinimalEObjectImpl.Container implements Generator {
	/**
	 * The cached value of the '{@link #getGeneratorBusAssociation() <em>Generator Bus Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorBusAssociation()
	 * @generated
	 * @ordered
	 */
	protected GeneratorBusAssociation generatorBusAssociation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Unifilar290922Package.Literals.GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorBusAssociation getGeneratorBusAssociation() {
		if (generatorBusAssociation != null && generatorBusAssociation.eIsProxy()) {
			InternalEObject oldGeneratorBusAssociation = (InternalEObject) generatorBusAssociation;
			generatorBusAssociation = (GeneratorBusAssociation) eResolveProxy(oldGeneratorBusAssociation);
			if (generatorBusAssociation != oldGeneratorBusAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Unifilar290922Package.GENERATOR__GENERATOR_BUS_ASSOCIATION, oldGeneratorBusAssociation,
							generatorBusAssociation));
			}
		}
		return generatorBusAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorBusAssociation basicGetGeneratorBusAssociation() {
		return generatorBusAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratorBusAssociation(GeneratorBusAssociation newGeneratorBusAssociation,
			NotificationChain msgs) {
		GeneratorBusAssociation oldGeneratorBusAssociation = generatorBusAssociation;
		generatorBusAssociation = newGeneratorBusAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Unifilar290922Package.GENERATOR__GENERATOR_BUS_ASSOCIATION, oldGeneratorBusAssociation,
					newGeneratorBusAssociation);
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
	public void setGeneratorBusAssociation(GeneratorBusAssociation newGeneratorBusAssociation) {
		if (newGeneratorBusAssociation != generatorBusAssociation) {
			NotificationChain msgs = null;
			if (generatorBusAssociation != null)
				msgs = ((InternalEObject) generatorBusAssociation).eInverseRemove(this,
						Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__GENERATOR, GeneratorBusAssociation.class,
						msgs);
			if (newGeneratorBusAssociation != null)
				msgs = ((InternalEObject) newGeneratorBusAssociation).eInverseAdd(this,
						Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__GENERATOR, GeneratorBusAssociation.class,
						msgs);
			msgs = basicSetGeneratorBusAssociation(newGeneratorBusAssociation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Unifilar290922Package.GENERATOR__GENERATOR_BUS_ASSOCIATION, newGeneratorBusAssociation,
					newGeneratorBusAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Unifilar290922Package.GENERATOR__GENERATOR_BUS_ASSOCIATION:
			if (generatorBusAssociation != null)
				msgs = ((InternalEObject) generatorBusAssociation).eInverseRemove(this,
						Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__GENERATOR, GeneratorBusAssociation.class,
						msgs);
			return basicSetGeneratorBusAssociation((GeneratorBusAssociation) otherEnd, msgs);
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
		case Unifilar290922Package.GENERATOR__GENERATOR_BUS_ASSOCIATION:
			return basicSetGeneratorBusAssociation(null, msgs);
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
		case Unifilar290922Package.GENERATOR__GENERATOR_BUS_ASSOCIATION:
			if (resolve)
				return getGeneratorBusAssociation();
			return basicGetGeneratorBusAssociation();
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
		case Unifilar290922Package.GENERATOR__GENERATOR_BUS_ASSOCIATION:
			setGeneratorBusAssociation((GeneratorBusAssociation) newValue);
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
		case Unifilar290922Package.GENERATOR__GENERATOR_BUS_ASSOCIATION:
			setGeneratorBusAssociation((GeneratorBusAssociation) null);
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
		case Unifilar290922Package.GENERATOR__GENERATOR_BUS_ASSOCIATION:
			return generatorBusAssociation != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneratorImpl
