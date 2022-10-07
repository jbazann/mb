/**
 */
package unifilar290922.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import unifilar290922.Bus;
import unifilar290922.Generator;
import unifilar290922.Line;
import unifilar290922.Load;
import unifilar290922.OneLineDiagram;
import unifilar290922.Unifilar290922Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Line Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unifilar290922.impl.OneLineDiagramImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link unifilar290922.impl.OneLineDiagramImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link unifilar290922.impl.OneLineDiagramImpl#getLine <em>Line</em>}</li>
 *   <li>{@link unifilar290922.impl.OneLineDiagramImpl#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OneLineDiagramImpl extends MinimalEObjectImpl.Container implements OneLineDiagram {
	/**
	 * The cached value of the '{@link #getLoad() <em>Load</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected EList<Load> load;

	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected EList<Generator> generator;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> line;

	/**
	 * The cached value of the '{@link #getBus() <em>Bus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus()
	 * @generated
	 * @ordered
	 */
	protected EList<Bus> bus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneLineDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Unifilar290922Package.Literals.ONE_LINE_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Load> getLoad() {
		if (load == null) {
			load = new EObjectContainmentEList<Load>(Load.class, this, Unifilar290922Package.ONE_LINE_DIAGRAM__LOAD);
		}
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generator> getGenerator() {
		if (generator == null) {
			generator = new EObjectContainmentEList<Generator>(Generator.class, this,
					Unifilar290922Package.ONE_LINE_DIAGRAM__GENERATOR);
		}
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLine() {
		if (line == null) {
			line = new EObjectContainmentEList<Line>(Line.class, this, Unifilar290922Package.ONE_LINE_DIAGRAM__LINE);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bus> getBus() {
		if (bus == null) {
			bus = new EObjectContainmentEList<Bus>(Bus.class, this, Unifilar290922Package.ONE_LINE_DIAGRAM__BUS);
		}
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Unifilar290922Package.ONE_LINE_DIAGRAM__LOAD:
			return ((InternalEList<?>) getLoad()).basicRemove(otherEnd, msgs);
		case Unifilar290922Package.ONE_LINE_DIAGRAM__GENERATOR:
			return ((InternalEList<?>) getGenerator()).basicRemove(otherEnd, msgs);
		case Unifilar290922Package.ONE_LINE_DIAGRAM__LINE:
			return ((InternalEList<?>) getLine()).basicRemove(otherEnd, msgs);
		case Unifilar290922Package.ONE_LINE_DIAGRAM__BUS:
			return ((InternalEList<?>) getBus()).basicRemove(otherEnd, msgs);
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
		case Unifilar290922Package.ONE_LINE_DIAGRAM__LOAD:
			return getLoad();
		case Unifilar290922Package.ONE_LINE_DIAGRAM__GENERATOR:
			return getGenerator();
		case Unifilar290922Package.ONE_LINE_DIAGRAM__LINE:
			return getLine();
		case Unifilar290922Package.ONE_LINE_DIAGRAM__BUS:
			return getBus();
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
		case Unifilar290922Package.ONE_LINE_DIAGRAM__LOAD:
			getLoad().clear();
			getLoad().addAll((Collection<? extends Load>) newValue);
			return;
		case Unifilar290922Package.ONE_LINE_DIAGRAM__GENERATOR:
			getGenerator().clear();
			getGenerator().addAll((Collection<? extends Generator>) newValue);
			return;
		case Unifilar290922Package.ONE_LINE_DIAGRAM__LINE:
			getLine().clear();
			getLine().addAll((Collection<? extends Line>) newValue);
			return;
		case Unifilar290922Package.ONE_LINE_DIAGRAM__BUS:
			getBus().clear();
			getBus().addAll((Collection<? extends Bus>) newValue);
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
		case Unifilar290922Package.ONE_LINE_DIAGRAM__LOAD:
			getLoad().clear();
			return;
		case Unifilar290922Package.ONE_LINE_DIAGRAM__GENERATOR:
			getGenerator().clear();
			return;
		case Unifilar290922Package.ONE_LINE_DIAGRAM__LINE:
			getLine().clear();
			return;
		case Unifilar290922Package.ONE_LINE_DIAGRAM__BUS:
			getBus().clear();
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
		case Unifilar290922Package.ONE_LINE_DIAGRAM__LOAD:
			return load != null && !load.isEmpty();
		case Unifilar290922Package.ONE_LINE_DIAGRAM__GENERATOR:
			return generator != null && !generator.isEmpty();
		case Unifilar290922Package.ONE_LINE_DIAGRAM__LINE:
			return line != null && !line.isEmpty();
		case Unifilar290922Package.ONE_LINE_DIAGRAM__BUS:
			return bus != null && !bus.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OneLineDiagramImpl
