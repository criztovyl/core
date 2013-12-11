/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.addon.ui.impl.mock;

import org.jboss.forge.addon.ui.DefaultUIProgressMonitor;
import org.jboss.forge.addon.ui.UIProgressMonitor;
import org.jboss.forge.addon.ui.context.UIContext;
import org.jboss.forge.addon.ui.spi.UIRuntime;

/**
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public class MockUIRuntime implements UIRuntime
{

   @Override
   public UIContext createUIContext()
   {
      return new MockUIContext();
   }

   @Override
   public UIProgressMonitor createProgressMonitor(UIContext context)
   {
      return new DefaultUIProgressMonitor();
   }
}
