package com.aymat.core.repositories.rest.dto;

import java.util.List;

public class PlantDetailDTO {
    private String plantMoneyText;
    private Long optimizerType;
    private String ammeterType;
    private String storagePgrid;
    private String todayEnergy;
    private String storageTodayPpv;
    private String invTodayPpv;
    private String totalEnergy;
    private Long nominalPower;
    private String todayDischarge;
    private String Co2Reduction;
    private Long isHaveOptimizer;
    private String storagePuser;
    private String useEnergy;
    private String totalMoneyText;
    private Long nominal_Power;
    private List<DeviceList> deviceList;

    private class DeviceList {
        private boolean lost;
        private String location;
        private String datalogSn;
        private String deviceSn;
        private String deviceStatus;
        private String pCharge;
        private String activePower;
        private String deviceAilas;
        private String deviceType;
        private String storageType;
        private String eChargeToday;
        private String apparentPower;
        private String capacity;
        private String energy;

        public boolean isLost() {
            return lost;
        }

        public void setLost(boolean lost) {
            this.lost = lost;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDatalogSn() {
            return datalogSn;
        }

        public void setDatalogSn(String datalogSn) {
            this.datalogSn = datalogSn;
        }

        public String getDeviceSn() {
            return deviceSn;
        }

        public void setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
        }

        public String getDeviceStatus() {
            return deviceStatus;
        }

        public void setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
        }

        public String getpCharge() {
            return pCharge;
        }

        public void setpCharge(String pCharge) {
            this.pCharge = pCharge;
        }

        public String getActivePower() {
            return activePower;
        }

        public void setActivePower(String activePower) {
            this.activePower = activePower;
        }

        public String getDeviceAilas() {
            return deviceAilas;
        }

        public void setDeviceAilas(String deviceAilas) {
            this.deviceAilas = deviceAilas;
        }

        public String getDeviceType() {
            return deviceType;
        }

        public void setDeviceType(String deviceType) {
            this.deviceType = deviceType;
        }

        public String getStorageType() {
            return storageType;
        }

        public void setStorageType(String storageType) {
            this.storageType = storageType;
        }

        public String geteChargeToday() {
            return eChargeToday;
        }

        public void seteChargeToday(String eChargeToday) {
            this.eChargeToday = eChargeToday;
        }

        public String getApparentPower() {
            return apparentPower;
        }

        public void setApparentPower(String apparentPower) {
            this.apparentPower = apparentPower;
        }

        public String getCapacity() {
            return capacity;
        }

        public void setCapacity(String capacity) {
            this.capacity = capacity;
        }

        public String getEnergy() {
            return energy;
        }

        public void setEnergy(String energy) {
            this.energy = energy;
        }
    }

    public String getPlantMoneyText() {
        return plantMoneyText;
    }

    public void setPlantMoneyText(String plantMoneyText) {
        this.plantMoneyText = plantMoneyText;
    }

    public Long getOptimizerType() {
        return optimizerType;
    }

    public void setOptimizerType(Long optimizerType) {
        this.optimizerType = optimizerType;
    }

    public String getAmmeterType() {
        return ammeterType;
    }

    public void setAmmeterType(String ammeterType) {
        this.ammeterType = ammeterType;
    }

    public String getStoragePgrid() {
        return storagePgrid;
    }

    public void setStoragePgrid(String storagePgrid) {
        this.storagePgrid = storagePgrid;
    }

    public String getTodayEnergy() {
        return todayEnergy;
    }

    public void setTodayEnergy(String todayEnergy) {
        this.todayEnergy = todayEnergy;
    }

    public String getStorageTodayPpv() {
        return storageTodayPpv;
    }

    public void setStorageTodayPpv(String storageTodayPpv) {
        this.storageTodayPpv = storageTodayPpv;
    }

    public String getInvTodayPpv() {
        return invTodayPpv;
    }

    public void setInvTodayPpv(String invTodayPpv) {
        this.invTodayPpv = invTodayPpv;
    }

    public String getTotalEnergy() {
        return totalEnergy;
    }

    public void setTotalEnergy(String totalEnergy) {
        this.totalEnergy = totalEnergy;
    }

    public Long getNominalPower() {
        return nominalPower;
    }

    public void setNominalPower(Long nominalPower) {
        this.nominalPower = nominalPower;
    }

    public String getTodayDischarge() {
        return todayDischarge;
    }

    public void setTodayDischarge(String todayDischarge) {
        this.todayDischarge = todayDischarge;
    }

    public String getCo2Reduction() {
        return Co2Reduction;
    }

    public void setCo2Reduction(String co2Reduction) {
        Co2Reduction = co2Reduction;
    }

    public Long getIsHaveOptimizer() {
        return isHaveOptimizer;
    }

    public void setIsHaveOptimizer(Long isHaveOptimizer) {
        this.isHaveOptimizer = isHaveOptimizer;
    }

    public String getStoragePuser() {
        return storagePuser;
    }

    public void setStoragePuser(String storagePuser) {
        this.storagePuser = storagePuser;
    }

    public String getUseEnergy() {
        return useEnergy;
    }

    public void setUseEnergy(String useEnergy) {
        this.useEnergy = useEnergy;
    }

    public String getTotalMoneyText() {
        return totalMoneyText;
    }

    public void setTotalMoneyText(String totalMoneyText) {
        this.totalMoneyText = totalMoneyText;
    }

    public Long getNominal_Power() {
        return nominal_Power;
    }

    public void setNominal_Power(Long nominal_Power) {
        this.nominal_Power = nominal_Power;
    }

    public List<DeviceList> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<DeviceList> deviceList) {
        this.deviceList = deviceList;
    }
}
