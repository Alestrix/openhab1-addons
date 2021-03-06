/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.harmonyhub;

import org.openhab.binding.harmonyhub.internal.HarmonyHubBindingConfig;
import org.openhab.core.binding.BindingProvider;

/**
 * @author Dan Cunningham
 * @since 1.7.0
 */
public interface HarmonyHubBindingProvider extends BindingProvider {
    /**
     * return the binding configuration for an item
     * 
     * @param itemName
     * @return
     */
    public HarmonyHubBindingConfig getHarmonyHubBindingConfig(String itemName);
}
