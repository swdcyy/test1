package com.kwai.poi.api.constants.PoiErrorInfo;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PoiErrorInfo extends Enum	// class@0013a8
{
    public final int errCode;
    public final String errMsg;
    public static final PoiErrorInfo[] $VALUES;
    public static final PoiErrorInfo BIZ_PARAM_ERROR;
    public static final PoiErrorInfo CANCEL_ERROR;
    public static final PoiErrorInfo CITY_PARAM_ERROR;
    public static final PoiErrorInfo IP_ERROR;
    public static final PoiErrorInfo KEYWORD_PARAM_ERROR;
    public static final PoiErrorInfo LATLON_PARAM_ERROR;
    public static final PoiErrorInfo NET_ERROR;
    public static final PoiErrorInfo OTHER_ERROR;
    public static final PoiErrorInfo PARAMS_ERROR;
    public static final PoiErrorInfo TIMEOUT_ERROR;

    static {
       PoiErrorInfo[] poiErrorInfo = new PoiErrorInfo[10];
       PoiErrorInfo poiErrorInfo1 = new PoiErrorInfo("NET_ERROR", 0, 100, "网络错误");
       PoiErrorInfo.NET_ERROR = poiErrorInfo1;
       poiErrorInfo[0] = poiErrorInfo1;
       poiErrorInfo1 = new PoiErrorInfo("IP_ERROR", 1, 100, "自动获取经纬度失败");
       PoiErrorInfo.IP_ERROR = poiErrorInfo1;
       poiErrorInfo[1] = poiErrorInfo1;
       poiErrorInfo1 = new PoiErrorInfo("PARAMS_ERROR", 2, 102, "参数异常");
       PoiErrorInfo.PARAMS_ERROR = poiErrorInfo1;
       poiErrorInfo[2] = poiErrorInfo1;
       poiErrorInfo1 = new PoiErrorInfo("OTHER_ERROR", 3, 103, "其他错误");
       PoiErrorInfo.OTHER_ERROR = poiErrorInfo1;
       poiErrorInfo[3] = poiErrorInfo1;
       poiErrorInfo1 = new PoiErrorInfo("TIMEOUT_ERROR", 4, 104, "请求超时");
       PoiErrorInfo.TIMEOUT_ERROR = poiErrorInfo1;
       poiErrorInfo[4] = poiErrorInfo1;
       poiErrorInfo1 = new PoiErrorInfo("CANCEL_ERROR", 5, 105, "请求取消");
       PoiErrorInfo.CANCEL_ERROR = poiErrorInfo1;
       poiErrorInfo[5] = poiErrorInfo1;
       poiErrorInfo1 = new PoiErrorInfo("BIZ_PARAM_ERROR", 6, 106, "biz或subBiz不能为空");
       PoiErrorInfo.BIZ_PARAM_ERROR = poiErrorInfo1;
       poiErrorInfo[6] = poiErrorInfo1;
       poiErrorInfo1 = new PoiErrorInfo("LATLON_PARAM_ERROR", 7, 107, "经纬度不能为空");
       PoiErrorInfo.LATLON_PARAM_ERROR = poiErrorInfo1;
       poiErrorInfo[7] = poiErrorInfo1;
       poiErrorInfo1 = new PoiErrorInfo("CITY_PARAM_ERROR", 8, 108, "城市名不能为空");
       PoiErrorInfo.CITY_PARAM_ERROR = poiErrorInfo1;
       poiErrorInfo[8] = poiErrorInfo1;
       poiErrorInfo1 = new PoiErrorInfo("KEYWORD_PARAM_ERROR", 9, 109, "关键词不能为空");
       PoiErrorInfo.KEYWORD_PARAM_ERROR = poiErrorInfo1;
       poiErrorInfo[9] = poiErrorInfo1;
       PoiErrorInfo.$VALUES = poiErrorInfo;
    }
    public void PoiErrorInfo(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.errCode = p2;
       this.errMsg = p3;
    }
    public static PoiErrorInfo valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PoiErrorInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PoiErrorInfo.class, p0);
    }
    public static PoiErrorInfo[] values(){
       Object obj = PatchProxy.apply(null, null, PoiErrorInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PoiErrorInfo.$VALUES.clone();
    }
    public final int getErrCode(){
       return this.errCode;
    }
    public final String getErrMsg(){
       return this.errMsg;
    }
}
