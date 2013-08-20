/*
* This file is part of WebLookAndFeel library.
*
* WebLookAndFeel library is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* WebLookAndFeel library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with WebLookAndFeel library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.alee.extended.tree;

import com.alee.utils.compare.Filter;

import java.util.Comparator;

/**
 * Abstract data provider with implemented comparator and filter getters and setters.
 *
 * @author Mikle Garin
 * @since 1.4
 */

public abstract class AbstractTreeDataProvider<E extends AsyncUniqueNode> implements AsyncTreeDataProvider<E>
{
    /**
     * Childs comparator.
     */
    protected Comparator<E> comparator = null;

    /**
     * Childs filter.
     */
    protected Filter<E> filter = null;

    /**
     * {@inheritDoc}
     */
    public Comparator<E> getChildsComparator ( E node )
    {
        return comparator;
    }

    /**
     * Sets childs comparator for all nodes.
     *
     * @param comparator childs comparator for all nodes
     */
    public void setChildsComparator ( Comparator<E> comparator )
    {
        // todo Should be applied to model
        this.comparator = comparator;
    }

    /**
     * {@inheritDoc}
     */
    public Filter<E> getChildsFilter ( E node )
    {
        return filter;
    }

    /**
     * Sets childs filter for all nodes.
     *
     * @param filter childs filter for all nodes
     */
    public void setChildsFilter ( Filter<E> filter )
    {
        // todo Should be applied to model
        this.filter = filter;
    }
}