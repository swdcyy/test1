package com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegrade;
import java.io.Serializable;
import java.lang.Object;

public class DegradeConfig$UrlDegrade implements Serializable	// class@00131a
{
    public double[] mLatScope;
    public double[] mLonScope;
    public int mMaxPage;
    public int mPrecision;
    public String mUrlTemplate;
    public static final double[] b;
    public static final long serialVersionUID;

    static {
       DegradeConfig$UrlDegrade.b = new double[2]{0x7fefffffffffffff,1};
    }
    public void DegradeConfig$UrlDegrade(){
       super();
       this.mUrlTemplate = "";
       this.mMaxPage = 1;
       double[] b = DegradeConfig$UrlDegrade.b;
       this.mLatScope = b;
       this.mLonScope = b;
    }
}
