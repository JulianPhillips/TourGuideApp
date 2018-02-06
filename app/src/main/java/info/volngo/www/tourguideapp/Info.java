package info.volngo.www.tourguideapp;

public class Info {
    private String cityName;
    private String stateName;
    private String[] mName;
    private String[] mInfo;
    private int[] mImages;
    public Info(String[] prgmName, String[] prgmInfo, int[] prgmImage) {
        cityName = String.valueOf(R.string.city_name);
        stateName = String.valueOf(R.string.state_name);
        mName=prgmName;
        mInfo = prgmInfo;
        mImages = prgmImage;
    }

    public String getCityName() {
        return cityName;
    }
    public String getStateName() {
        return stateName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public String[] getmName() {
        return mName;
    }
    public void setmName(String[] mName) {
        this.mName = mName;
    }
    public String[] getmInfo() {
        return mInfo;
    }
    public void setmInfo(String[] mInfo) {
        this.mInfo = mInfo;
    }
    public int[] getmImages() {
        return mImages;
    }
    public void setmImages(int[] mImages) {
        this.mImages = mImages;
    }
}