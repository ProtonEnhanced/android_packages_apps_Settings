/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.android.settings.location;

import android.content.Context;
import android.provider.Settings;

import com.android.settingslib.core.lifecycle.Lifecycle;

public class LocationModeBatterySavingPreferenceController
        extends LocationModeRadioButtonPreferenceController {

    private static final String KEY_BATTERY_SAVING = "battery_saving";

    public LocationModeBatterySavingPreferenceController(Context context,
            Lifecycle lifecycle) {
        super(context, lifecycle);
    }

    @Override
    public String getPreferenceKey() {
        return KEY_BATTERY_SAVING;
    }

    @Override
    protected int getLocationMode() {
        return Settings.Secure.LOCATION_MODE_BATTERY_SAVING;
    }
}
