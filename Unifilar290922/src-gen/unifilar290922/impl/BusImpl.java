/**
 */
package unifilar290922.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import unifilar290922.Bus;
import unifilar290922.GeneratorBusAssociation;
import unifilar290922.Line;
import unifilar290922.LoadBusAssociation;
import unifilar290922.Unifilar290922Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unifilar290922.impl.BusImpl#getLine <em>Line</em>}</li>
 *   <li>{@link unifilar290922.impl.BusImpl#getLoadBusAssociation <em>Load Bus Association</em>}</li>
 *   <li>{@link unifilar290922.impl.BusImpl#getGeneratorBusAssociation <em>Generator Bus Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusImpl extends MinimalEObjectImpl.Container implements Bus {
	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> line;

	/**
	 * The cached value of the '{@link #getLoadBusAssociation() <em>Load Bus Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBusAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadBusAssociation> loadBusAssociation;

	/**
	 * The cached value of the '{@link #getGeneratorBusAssociation() <em>Generator Bus Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorBusAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorBusAssociation> generatorBusAssociation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Unifilar290922Package.Literals.BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLine() {
		if (line == null) {
			line = new EObjectWithInverseResolvingEList.ManyInverse<Line>(Line.class, this,
					Unifilar290922Package.BUS__LINE, Unifilar290922Package.LINE__BUS);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadBusAssociation> getLoadBusAssociation() {
		if (loadBusAssociation == null) {
			loadBusAssociation = new EObjectContainmentWithInverseEList<LoadBusAssociation>(LoadBusAssociation.class,
					this, Unifilar290922Package.BUS__LOAD_BUS_ASSOCIATION,
					Unifilar290922Package.LOAD_BUS_ASSOCIATION__BUS);
		}
		return loadBusAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorBusAssociation> getGeneratorBusAssociation() {
		if (generatorBusAssociation == null) {
			generatorBusAssociation = new EObjectContainmentWithInverseEList<GeneratorBusAssociation>(
					GeneratorBusAssociation.class, this, Unifilar290922Package.BUS__GENERATOR_BUS_ASSOCIATION,
					Unifilar290922Package.GENERATOR_BUS_ASSOCIATION__BUS);
		}
		return generatorBusAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Unifilar290922Package.BUS__LINE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLine()).basicAdd(otherEnd, msgs);
		case Unifilar290922Package.BUS__LOAD_BUS_ASSOCIATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLoadBusAssociation()).basicAdd(otherEnd,
					msgs);
		case Unifilar290922Package.BUS__GENERATOR_BUS_ASSOCIATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneratorBusAssociation()).basicAdd(otherEnd,
					msgs);
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
		case Unifilar290922Package.BUS__LINE:
			return ((InternalEList<?>) getLine()).basicRemove(otherEnd, msgs);
		case Unifilar290922Package.BUS__LOAD_BUS_ASSOCIATION:
			return ((InternalEList<?>) getLoadBusAssociation()).basicRemove(otherEnd, msgs);
		case Unifilar290922Package.BUS__GENERATOR_BUS_ASSOCIATION:
			return ((InternalEList<?>) getGeneratorBusAssociation()).basicRemove(otherEnd, msgs);
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
		case Unifilar290922Package.BUS__LINE:
			return getLine();
		case Unifilar290922Package.BUS__LOAD_BUS_ASSOCIATION:
			return getLoadBusAssociation();
		case Unifilar290922Package.BUS__GENERATOR_BUS_ASSOCIATION:
			return getGeneratorBusAssociation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Unifilar290922Package.BUS__LINE:
			getLine().clear();
			getLine().addAll((Collection<? extends Line>) newValue);
			return;
		case Unifilar290922Package.BUS__LOAD_BUS_ASSOCIATION:
			getLoadBusAssociation().clear();
			getLoadBusAssociation().addAll((Collection<? extends LoadBusAssociation>) newValue);
			return;
		case Unifilar290922Package.BUS__GENERATOR_BUS_ASSOCIATION:
			getGeneratorBusAssociation().clear();
			getGeneratorBusAssociation().addAll((Collection<? extends GeneratorBusAssociation>) newValue);
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
		case Unifilar290922Package.BUS__LINE:
			getLine().clear();
			return;
		case Unifilar290922Package.BUS__LOAD_BUS_ASSOCIATION:
			getLoadBusAssociation().clear();
			return;
		case Unifilar290922Package.BUS__GENERATOR_BUS_ASSOCIATION:
			getGeneratorBusAssociation().clear();
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
		case Unifilar290922Package.BUS__LINE:
			return line != null && !line.isEmpty();
		case Unifilar290922Package.BUS__LOAD_BUS_ASSOCIATION:
			return loadBusAssociation != null && !loadBusAssociation.isEmpty();
		case Unifilar290922Package.BUS__GENERATOR_BUS_ASSOCIATION:
			return generatorBusAssociation != null && !generatorBusAssociation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusImpl
