package com.mobiliya.fleet.db.tables;

public class ParameterTable extends DB_BASIC {
    public String TripId;
    public String TenantId;
    public String UserId;
    public String VehicleId;

    public String VIN;
    public int RPM;
    public float Speed;
    public int MaxSpeed;
    public float HiResMaxSpeed;
    public float Distance;
    public float HiResDistance;
    public float LoResDistance;
    public float Odometer;
    public float HiResOdometer;
    public float LoResOdometer;
    public float TotalHours;
    public float IdleHours;
    public int PctLoad;
    public int PctTorque;
    public int DrvPctTorque;
    public String TorqueMode;
    public float FuelUsed;
    public float HiResFuelUsed;
    public float IdleFuelUsed;
    public float FuelRate;
    public float AvgFuelEcon;
    public float InstFuelEcon;
    public float PrimaryFuelLevel;
    public float SecondaryFuelLevel;
    public float OilTemp;
    public float OilPressure;
    public float TransTemp;
    public float IntakeTemp;
    public float IntakePressure;
    public float CoolantTemp;
    public float CoolantLevel;
    public float CoolantPressure;
    public float BrakeAppPressure;
    public float Brake1AirPressure;
    public float Brake2AirPressure;
    public float AccelPedal;
    public float ThrottlePos;
    public float BatteryPotential;
    public int SelectedGear;
    public int CurrentGear;
    public String Make;
    public String Model;
    public String SerialNo;
    public String UnitNo;
    public String EngineVIN;
    public String EngineMake;
    public String EngineModel;
    public String EngineSerialNo;
    public String EngineUnitNo;
    public String ClutchSwitch;
    public String BrakeSwitch;
    public String ParkBrakeSwitch;
    public float CruiseSetSpeed;
    public String CruiseOnOff;
    public String CruiseSet;
    public String CruiseCoast;
    public String CruiseResume;
    public String CruiseAccel;
    public String CruiseActive;
    public String CruiseState;
    public String FaultSource;
    public String FaultSPN;
    public String FaultDescription;
    public String FaultFMI;
    public String FaultOccurrence;
    public String FaultConversion;

    public String Latitude;
    public String Longitude;

    public String ParameterDateTime;
    public String AdapterId;
    public String FirmwareVersion;
    public String HardwareVersion;
    public String AdapterSerialNo;
    public String HardwareType;
    public boolean IsKeyOn;

    public String SleepMode;
    public int LedBrightness;
    public String Message;
    public String Status;

    public int PGN;
    public String PGNActualValue;
    public String PGNRawValue;

    public double AmbientTemp;
    public double DPFOutletTemp;
    public double EngineIntakeManifoldTemp;
    public double DPFInletTemp;
    public double EngineIntakeManifoldPressure;
    public double DPFPressureDifferential;
    public double EngineCrankcasePressure;
    public double EngineTurbochargerSpeed;
    public double FuelTemp;
    public String SCRInletNox;
    public String SCROutletNox;
    public double TotalNoOfPassiveRegenerations;
    public String DPFAshLoad;
    public double TotalNoOfActiveRegenerations;
    public String DPFSootLoad;
    public double BarometricPressure;
    public String FanState;
    public float VehicleSpeed;
}
