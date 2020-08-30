package com.aymat.core.repositories.rest.dto;

public class LoginPlantaDTO {
    private Back back;

    public Back getBack() {
        return back;
    }

    public void setBack(Back back) {
        this.back = back;
    }

    public class Back {
        private Long userId;
        private Long userLevel;
        private boolean success;

        public Long getUserId() {
            return userId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public Long getUserLevel() {
            return userLevel;
        }

        public void setUserLevel(Long userLevel) {
            this.userLevel = userLevel;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }
    }
}
