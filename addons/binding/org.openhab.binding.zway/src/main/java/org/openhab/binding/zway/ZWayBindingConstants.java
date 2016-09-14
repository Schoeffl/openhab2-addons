/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.zway;

import java.util.Set;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

import com.google.common.collect.ImmutableSet;

/**
 * The {@link ZWayBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Patrick Hecker - Initial contribution
 */
public class ZWayBindingConstants {

    public static final String BINDING_ID = "zway";

    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_BRIDGE = new ThingTypeUID(BINDING_ID, "zwayServer");
    public final static ThingTypeUID THING_TYPE_DEVICE = new ThingTypeUID(BINDING_ID, "zwayDevice");
    public final static ThingTypeUID THING_TYPE_VIRTUAL_DEVICE = new ThingTypeUID(BINDING_ID, "zwayVirtualDevice");

    public final static Set<ThingTypeUID> SUPPORTED_DEVICE_THING_TYPES_UIDS = ImmutableSet.of(THING_TYPE_DEVICE,
            THING_TYPE_VIRTUAL_DEVICE);

    // List of all Channel IDs
    public final static String BATTERY_CHANNEL = "battery";
    public final static String DOORLOCK_CHANNEL = "doorlock";
    public final static String SENSOR_BINARY_CHANNEL = "sensorBinary";
    public final static String SENSOR_MULTILEVEL_CHANNEL = "sensorMultilevel";
    public final static String SWITCH_BINARY_CHANNEL = "switchBinary";
    public final static String SWITCH_CONTROL_CHANNEL = "switchControl";
    public final static String SWITCH_MULTILEVEL_CHANNEL = "switchMultilevel";
    // switch multilevel (color)
    public final static String SWITCH_COLOR_CHANNEL = "switchColor";
    public final static String SWITCH_COLOR_TEMPERATURE_CHANNEL = "switchColorTemperature";
    // sensor multilevel
    public final static String SENSOR_TEMPERATURE_CHANNEL = "sensorTemperature";
    public final static String SENSOR_LUMINOSITY_CHANNEL = "sensorLuminosity";
    public final static String SENSOR_HUMIDITY_CHANNEL = "sensorHumidity";
    public final static String SENSOR_BAROMETER_CHANNEL = "sensorBarometer";
    public final static String SENSOR_ULTRAVIOLET_CHANNEL = "sensorUltraviolet";
    public final static String SENSOR_CO2_CHANNEL = "sensorCO2";
    public final static String SENSOR_ENERGY_CHANNEL = "sensorEnergy";
    // sensor multilevel (meter)
    public final static String SENSOR_METER_KWH_CHANNEL = "sensorMeterKWh";
    public final static String SENSOR_METER_W_CHANNEL = "sensorMeterW";
    // sensor binary
    public final static String SENSOR_SMOKE_CHANNEL = "sensorSmoke";
    public final static String SENSOR_CO_CHANNEL = "sensorCo";
    public final static String SENSOR_FLOOD_CHANNEL = "sensorFlood";
    public final static String SENSOR_TAMPER_CHANNEL = "sensorTamper";
    public final static String SENSOR_DOOR_WINDOW_CHANNEL = "sensorDoorWindow";
    public final static String SENSOR_MOTION_CHANNEL = "sensorMotion";
    // switch binary
    public final static String SWITCH_POWER_OUTLET_CHANNEL = "switchPowerOutlet";

    /* Bridge config properties */
    public final static String BRIDGE_CONFIG_OPENHAB_ALIAS = "openHabAlias";
    public final static String BRIDGE_CONFIG_OPENHAB_IP_ADDRESS = "openHabIpAddress";
    public final static String BRIDGE_CONFIG_OPENHAB_PORT = "openHabPort";
    public final static String BRIDGE_CONFIG_OPENHAB_PROTOCOL = "openHabProtocol";
    public final static String BRIDGE_CONFIG_ZWAY_SERVER_IP_ADDRESS = "zwayServerIpAddress";
    public final static String BRIDGE_CONFIG_ZWAY_SERVER_PORT = "zwayServerPort";
    public final static String BRIDGE_CONFIG_ZWAY_SERVER_PROTOCOL = "zwayServerProtocol";
    public final static String BRIDGE_CONFIG_ZWAY_SERVER_USERNAME = "zwayServerUsername";
    public final static String BRIDGE_CONFIG_ZWAY_SERVER_PASSWORD = "zwayServerPassword";
    public final static String BRIDGE_CONFIG_POLLING_INTERVAL = "pollingInterval";
    public final static String BRIDGE_CONFIG_OBSERVER_MECHANISM_ENABLED = "observerMechanismEnabled";

    public final static String DEVICE_CONFIG_NODE_ID = "nodeId";
    public final static String DEVICE_CONFIG_VIRTUAL_DEVICE_ID = "deviceId";

    /* Bridge properties */
    public final static String BRIDGE_PROP_VENDOR = "vendor";
}
