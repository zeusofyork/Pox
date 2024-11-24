/*
 * WearableSpoof
 * Copyright (C) 2023 Simon1511
 * CaimanSpoof
 * Copyright (C) 2024 RisenID
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.risenid.OnePlus9Prospoof;

import android.os.Build;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class MainHook implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {        
        XposedBridge.log("OnePlus9ProSpoof: Hooking into: " + lpparam.packageName);

        // ro.product.manufacturer
        XposedHelpers.setStaticObjectField(Build.class, "MANUFACTURER", "Google");

        // ro.product.brand
        XposedHelpers.setStaticObjectField(Build.class, "BRAND", "google");

        // ro.product.device
        XposedHelpers.setStaticObjectField(Build.class, "DEVICE", "OnePlus9Pro");

        // ro.product.system.device
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.DEVICE", "generic");

        // ro.build.tags
        XposedHelpers.setStaticObjectField(Build.class, "TAGS", "release-keys");

        // ro.build.type
        XposedHelpers.setStaticObjectField(Build.class, "TYPE", "user");

        // ro.product.product
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT", "OnePlus9Pro");

        // ro.product.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "OnePlus9Pro");

        // ro.product.system.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "OnePlus9Pro");

        // ro.product.vendor.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "OnePlus9Pro");

        // ro.product.system_ext.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "OnePlus9Pro");

        // ro.product.system.name
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.NAME", "mainline");

        // ro.product.vendor.name
        XposedHelpers.setStaticObjectField(Build.class, "VENDOR.NAME", "OnePlus9Pro");

        // ro.product.system_ext.name
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM_EXT.NAME", "OnePlus9Pro");

        // ro.system_ext.model
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM_EXT.MODEL", "OnePlus 8 Pro");

        // ro.product.model
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT.MODEL", "OnePlus 9 Pro");

        // ro.product.vendor.model
        XposedHelpers.setStaticObjectField(Build.class, "VENDOR.MODEL", "OnePlus 9 Pro");

        // ro.product.system.model
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.MODEL", "mainline");

        // ro.product.flavor
        XposedHelpers.setStaticObjectField(Build.class, "FLAVOUR", "OnePlus9Pro-user");

        // ro.soc.model
        XposedHelpers.setStaticObjectField(Build.class, "SOC.MODEL", "Tensor G4");

        // ro.product.board
        XposedHelpers.setStaticObjectField(Build.class, "BOARD", "OnePlus9Pro");

        // ro.build.id
        XposedHelpers.setStaticObjectField(Build.class, "ID", "AD1A.240530.047.U1");

        // ro.build.OnePlus/OnePlus9Pro/OnePlus9Pro:12/SKQ1.210216.001/R.202109102211:user/release-keys__2021-09-05
        XposedHelpers.setStaticObjectField(Build.class, "FINGERPRINT",
                "google/OnePlus9Pro/OnePlus9Pro:14/AD1A.240530.047.U1/12150698:user/release-keys");
    }
}