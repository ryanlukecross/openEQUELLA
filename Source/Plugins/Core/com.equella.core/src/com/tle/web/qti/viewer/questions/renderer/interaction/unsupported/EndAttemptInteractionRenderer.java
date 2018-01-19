/*
 * Copyright 2017 Apereo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tle.web.qti.viewer.questions.renderer.interaction.unsupported;

import uk.ac.ed.ph.jqtiplus.node.item.interaction.EndAttemptInteraction;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;
import com.tle.web.qti.viewer.QtiViewerContext;
import com.tle.web.qti.viewer.questions.renderer.QtiNodeRenderer;
import com.tle.web.sections.render.SectionRenderable;

/**
 * Not supported until individual submission mode is supported.
 * 
 * @author Aaron
 */
public class EndAttemptInteractionRenderer extends QtiNodeRenderer
{
	@SuppressWarnings("unused")
	private final EndAttemptInteraction model;

	@AssistedInject
	public EndAttemptInteractionRenderer(@Assisted EndAttemptInteraction model, @Assisted QtiViewerContext context)
	{
		super(model, context);
		this.model = model;
	}

	@Override
	protected SectionRenderable createTopRenderable()
	{
		return null;
	}

	@Override
	protected SectionRenderable createNestedRenderable()
	{
		return null;
	}
}