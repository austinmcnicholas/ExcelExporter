// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package odm.proxies;

public class OrderLine
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject orderLineMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ODM.OrderLine";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Amount("Amount"),
		Price("Price"),
		PriceExclVAT("PriceExclVAT"),
		PriceInclVAT("PriceInclVAT"),
		DiscountPercentage("DiscountPercentage"),
		TotalExclVAT("TotalExclVAT"),
		TotalInclVAT("TotalInclVAT"),
		OrderLine_Product("ODM.OrderLine_Product"),
		OrderLine_Order("ODM.OrderLine_Order");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public OrderLine(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ODM.OrderLine"));
	}

	protected OrderLine(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject orderLineMendixObject)
	{
		if (orderLineMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ODM.OrderLine", orderLineMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ODM.OrderLine");

		this.orderLineMendixObject = orderLineMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'OrderLine.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static odm.proxies.OrderLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return odm.proxies.OrderLine.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static odm.proxies.OrderLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new odm.proxies.OrderLine(context, mendixObject);
	}

	public static odm.proxies.OrderLine load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return odm.proxies.OrderLine.initialize(context, mendixObject);
	}

	public static java.util.List<odm.proxies.OrderLine> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<odm.proxies.OrderLine> result = new java.util.ArrayList<odm.proxies.OrderLine>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ODM.OrderLine" + xpathConstraint))
			result.add(odm.proxies.OrderLine.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Amount
	 */
	public final java.lang.Integer getAmount()
	{
		return getAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of Amount
	 */
	public final java.lang.Integer getAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Amount.toString());
	}

	/**
	 * Set value of Amount
	 * @param amount
	 */
	public final void setAmount(java.lang.Integer amount)
	{
		setAmount(getContext(), amount);
	}

	/**
	 * Set value of Amount
	 * @param context
	 * @param amount
	 */
	public final void setAmount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer amount)
	{
		getMendixObject().setValue(context, MemberNames.Amount.toString(), amount);
	}

	/**
	 * @return value of Price
	 */
	public final java.lang.Double getPrice()
	{
		return getPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of Price
	 */
	public final java.lang.Double getPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.Price.toString());
	}

	/**
	 * Set value of Price
	 * @param price
	 */
	public final void setPrice(java.lang.Double price)
	{
		setPrice(getContext(), price);
	}

	/**
	 * Set value of Price
	 * @param context
	 * @param price
	 */
	public final void setPrice(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double price)
	{
		getMendixObject().setValue(context, MemberNames.Price.toString(), price);
	}

	/**
	 * @return value of PriceExclVAT
	 */
	public final java.lang.Double getPriceExclVAT()
	{
		return getPriceExclVAT(getContext());
	}

	/**
	 * @param context
	 * @return value of PriceExclVAT
	 */
	public final java.lang.Double getPriceExclVAT(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.PriceExclVAT.toString());
	}

	/**
	 * Set value of PriceExclVAT
	 * @param priceexclvat
	 */
	public final void setPriceExclVAT(java.lang.Double priceexclvat)
	{
		setPriceExclVAT(getContext(), priceexclvat);
	}

	/**
	 * Set value of PriceExclVAT
	 * @param context
	 * @param priceexclvat
	 */
	public final void setPriceExclVAT(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double priceexclvat)
	{
		getMendixObject().setValue(context, MemberNames.PriceExclVAT.toString(), priceexclvat);
	}

	/**
	 * @return value of PriceInclVAT
	 */
	public final java.lang.Double getPriceInclVAT()
	{
		return getPriceInclVAT(getContext());
	}

	/**
	 * @param context
	 * @return value of PriceInclVAT
	 */
	public final java.lang.Double getPriceInclVAT(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.PriceInclVAT.toString());
	}

	/**
	 * Set value of PriceInclVAT
	 * @param priceinclvat
	 */
	public final void setPriceInclVAT(java.lang.Double priceinclvat)
	{
		setPriceInclVAT(getContext(), priceinclvat);
	}

	/**
	 * Set value of PriceInclVAT
	 * @param context
	 * @param priceinclvat
	 */
	public final void setPriceInclVAT(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double priceinclvat)
	{
		getMendixObject().setValue(context, MemberNames.PriceInclVAT.toString(), priceinclvat);
	}

	/**
	 * @return value of DiscountPercentage
	 */
	public final java.lang.Integer getDiscountPercentage()
	{
		return getDiscountPercentage(getContext());
	}

	/**
	 * @param context
	 * @return value of DiscountPercentage
	 */
	public final java.lang.Integer getDiscountPercentage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.DiscountPercentage.toString());
	}

	/**
	 * Set value of DiscountPercentage
	 * @param discountpercentage
	 */
	public final void setDiscountPercentage(java.lang.Integer discountpercentage)
	{
		setDiscountPercentage(getContext(), discountpercentage);
	}

	/**
	 * Set value of DiscountPercentage
	 * @param context
	 * @param discountpercentage
	 */
	public final void setDiscountPercentage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer discountpercentage)
	{
		getMendixObject().setValue(context, MemberNames.DiscountPercentage.toString(), discountpercentage);
	}

	/**
	 * @return value of TotalExclVAT
	 */
	public final java.lang.Double getTotalExclVAT()
	{
		return getTotalExclVAT(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalExclVAT
	 */
	public final java.lang.Double getTotalExclVAT(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.TotalExclVAT.toString());
	}

	/**
	 * Set value of TotalExclVAT
	 * @param totalexclvat
	 */
	public final void setTotalExclVAT(java.lang.Double totalexclvat)
	{
		setTotalExclVAT(getContext(), totalexclvat);
	}

	/**
	 * Set value of TotalExclVAT
	 * @param context
	 * @param totalexclvat
	 */
	public final void setTotalExclVAT(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double totalexclvat)
	{
		getMendixObject().setValue(context, MemberNames.TotalExclVAT.toString(), totalexclvat);
	}

	/**
	 * @return value of TotalInclVAT
	 */
	public final java.lang.Double getTotalInclVAT()
	{
		return getTotalInclVAT(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalInclVAT
	 */
	public final java.lang.Double getTotalInclVAT(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.TotalInclVAT.toString());
	}

	/**
	 * Set value of TotalInclVAT
	 * @param totalinclvat
	 */
	public final void setTotalInclVAT(java.lang.Double totalinclvat)
	{
		setTotalInclVAT(getContext(), totalinclvat);
	}

	/**
	 * Set value of TotalInclVAT
	 * @param context
	 * @param totalinclvat
	 */
	public final void setTotalInclVAT(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double totalinclvat)
	{
		getMendixObject().setValue(context, MemberNames.TotalInclVAT.toString(), totalinclvat);
	}

	/**
	 * @return value of OrderLine_Product
	 */
	public final odm.proxies.Product getOrderLine_Product() throws com.mendix.core.CoreException
	{
		return getOrderLine_Product(getContext());
	}

	/**
	 * @param context
	 * @return value of OrderLine_Product
	 */
	public final odm.proxies.Product getOrderLine_Product(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		odm.proxies.Product result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OrderLine_Product.toString());
		if (identifier != null)
			result = odm.proxies.Product.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OrderLine_Product
	 * @param orderline_product
	 */
	public final void setOrderLine_Product(odm.proxies.Product orderline_product)
	{
		setOrderLine_Product(getContext(), orderline_product);
	}

	/**
	 * Set value of OrderLine_Product
	 * @param context
	 * @param orderline_product
	 */
	public final void setOrderLine_Product(com.mendix.systemwideinterfaces.core.IContext context, odm.proxies.Product orderline_product)
	{
		if (orderline_product == null)
			getMendixObject().setValue(context, MemberNames.OrderLine_Product.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OrderLine_Product.toString(), orderline_product.getMendixObject().getId());
	}

	/**
	 * @return value of OrderLine_Order
	 */
	public final odm.proxies.Order getOrderLine_Order() throws com.mendix.core.CoreException
	{
		return getOrderLine_Order(getContext());
	}

	/**
	 * @param context
	 * @return value of OrderLine_Order
	 */
	public final odm.proxies.Order getOrderLine_Order(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		odm.proxies.Order result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OrderLine_Order.toString());
		if (identifier != null)
			result = odm.proxies.Order.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OrderLine_Order
	 * @param orderline_order
	 */
	public final void setOrderLine_Order(odm.proxies.Order orderline_order)
	{
		setOrderLine_Order(getContext(), orderline_order);
	}

	/**
	 * Set value of OrderLine_Order
	 * @param context
	 * @param orderline_order
	 */
	public final void setOrderLine_Order(com.mendix.systemwideinterfaces.core.IContext context, odm.proxies.Order orderline_order)
	{
		if (orderline_order == null)
			getMendixObject().setValue(context, MemberNames.OrderLine_Order.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OrderLine_Order.toString(), orderline_order.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return orderLineMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final odm.proxies.OrderLine that = (odm.proxies.OrderLine) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "ODM.OrderLine";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}