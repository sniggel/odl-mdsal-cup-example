package org.opendaylight.yang.gen.v1.inocybe.rev141116;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;


/**
 * Indicates that there are no more cups.
 * <p>This class represents the following YANG schema fragment defined in module <b>cup</b>
 * <br />(Source path: <i>META-INF/yang/cup.yang</i>):
 * <pre>
 * notification cupsRestocked {
 *     description
 *         "Indicates that there are no more cups.";
 *     leaf amountOfCups {
 *         type uint32;
 *     }
 *     status CURRENT;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>cup/cupsRestocked</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.inocybe.rev141116.CupsRestockedBuilder}.
 * @see org.opendaylight.yang.gen.v1.inocybe.rev141116.CupsRestockedBuilder
 */
public interface CupsRestocked
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.inocybe.rev141116.CupsRestocked>,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("inocybe","2014-11-16","cupsRestocked");;

    /**
     * Indicates the amount of cups that was re-stocked
     */
    java.lang.Long getAmountOfCups();

}

