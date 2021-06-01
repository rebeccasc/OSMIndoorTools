package de.rebsc.oio.api

/******************************************************************************
 * Copyright (C) 2021  de.rebsc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import de.rebsc.oio.data.OSMDataSet

interface OSMIndoorOptimizer {

    /**
     * Merge overlapping areas
     * @param data set to optimize
     * @return optimized data set
     */
    fun mergeOverlaps(data: OSMDataSet): OSMDataSet

    /**
     * Merge close nodes
     * @param data set to optimize
     * @param mergeDistance minimum distance between two nodes to merge
     * @return optimized data set
     */
    fun mergeCloseNodes(data: OSMDataSet, mergeDistance: Double): OSMDataSet

    /**
     * Orthogonalize shape of objects
     * @param data set to optimize
     * @return optimized data set
     */
    fun orthogonalizeShape(data: OSMDataSet): OSMDataSet

}