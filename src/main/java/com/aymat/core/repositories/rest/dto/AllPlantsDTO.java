package com.aymat.core.repositories.rest.dto;

import java.util.List;

public class AllPlantsDTO {
    private Back back;

    public Back getBack() {
        return back;
    }

    public void setBack(Back back) {
        this.back = back;
    }

    public class Back {
        private List<Data> data;
        private TotalData totalData;
        private boolean success;

        private class Data {
            private String plantMoneyText;
            private String storageStatus;
            private String plantName;
            private String plantId;
            private String storagePCharge;
            private String storageCapacity;
            private String isHaveStorage;
            private String todayEnergy;
            private String storagePDisCharge;
            private String totalEnergy;
            private String currentPower;

            public String getPlantMoneyText() {
                return plantMoneyText;
            }

            public void setPlantMoneyText(String plantMoneyText) {
                this.plantMoneyText = plantMoneyText;
            }

            public String getStorageStatus() {
                return storageStatus;
            }

            public void setStorageStatus(String storageStatus) {
                this.storageStatus = storageStatus;
            }

            public String getPlantName() {
                return plantName;
            }

            public void setPlantName(String plantName) {
                this.plantName = plantName;
            }

            public String getPlantId() {
                return plantId;
            }

            public void setPlantId(String plantId) {
                this.plantId = plantId;
            }

            public String getStoragePCharge() {
                return storagePCharge;
            }

            public void setStoragePCharge(String storagePCharge) {
                this.storagePCharge = storagePCharge;
            }

            public String getStorageCapacity() {
                return storageCapacity;
            }

            public void setStorageCapacity(String storageCapacity) {
                this.storageCapacity = storageCapacity;
            }

            public String getIsHaveStorage() {
                return isHaveStorage;
            }

            public void setIsHaveStorage(String isHaveStorage) {
                this.isHaveStorage = isHaveStorage;
            }

            public String getTodayEnergy() {
                return todayEnergy;
            }

            public void setTodayEnergy(String todayEnergy) {
                this.todayEnergy = todayEnergy;
            }

            public String getStoragePDisCharge() {
                return storagePDisCharge;
            }

            public void setStoragePDisCharge(String storagePDisCharge) {
                this.storagePDisCharge = storagePDisCharge;
            }

            public String getTotalEnergy() {
                return totalEnergy;
            }

            public void setTotalEnergy(String totalEnergy) {
                this.totalEnergy = totalEnergy;
            }

            public String getCurrentPower() {
                return currentPower;
            }

            public void setCurrentPower(String currentPower) {
                this.currentPower = currentPower;
            }
        }

        private class TotalData {
            private String currentPowerSum;
            private String storageCapacity;
            private String storagePCharge;
            private String CO2Sum;
            private String isHaveStorage;
            private String eTotalMoneyText;
            private String storagePDisCharge;
            private String todayEnergySum;
            private String totalEnergySum;
            private String storagePacToUser;

            public String getCurrentPowerSum() {
                return currentPowerSum;
            }

            public void setCurrentPowerSum(String currentPowerSum) {
                this.currentPowerSum = currentPowerSum;
            }

            public String getStorageCapacity() {
                return storageCapacity;
            }

            public void setStorageCapacity(String storageCapacity) {
                this.storageCapacity = storageCapacity;
            }

            public String getStoragePCharge() {
                return storagePCharge;
            }

            public void setStoragePCharge(String storagePCharge) {
                this.storagePCharge = storagePCharge;
            }

            public String getCO2Sum() {
                return CO2Sum;
            }

            public void setCO2Sum(String CO2Sum) {
                this.CO2Sum = CO2Sum;
            }

            public String getIsHaveStorage() {
                return isHaveStorage;
            }

            public void setIsHaveStorage(String isHaveStorage) {
                this.isHaveStorage = isHaveStorage;
            }

            public String geteTotalMoneyText() {
                return eTotalMoneyText;
            }

            public void seteTotalMoneyText(String eTotalMoneyText) {
                this.eTotalMoneyText = eTotalMoneyText;
            }

            public String getStoragePDisCharge() {
                return storagePDisCharge;
            }

            public void setStoragePDisCharge(String storagePDisCharge) {
                this.storagePDisCharge = storagePDisCharge;
            }

            public String getTodayEnergySum() {
                return todayEnergySum;
            }

            public void setTodayEnergySum(String todayEnergySum) {
                this.todayEnergySum = todayEnergySum;
            }

            public String getTotalEnergySum() {
                return totalEnergySum;
            }

            public void setTotalEnergySum(String totalEnergySum) {
                this.totalEnergySum = totalEnergySum;
            }

            public String getStoragePacToUser() {
                return storagePacToUser;
            }

            public void setStoragePacToUser(String storagePacToUser) {
                this.storagePacToUser = storagePacToUser;
            }
        }

        public List<Data> getData() {
            return data;
        }

        public void setData(List<Data> data) {
            this.data = data;
        }

        public TotalData getTotalData() {
            return totalData;
        }

        public void setTotalData(TotalData totalData) {
            this.totalData = totalData;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }
    }
}
