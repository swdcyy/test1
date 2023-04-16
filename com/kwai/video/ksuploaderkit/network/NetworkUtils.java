package com.kwai.video.ksuploaderkit.network.NetworkUtils;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$UploadStep;
import com.kwai.video.ksuploaderkit.network.NetworkUtils$NetErrorCode;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.ksuploaderkit.network.NetworkUtils$1;
import java.lang.Enum;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ERRORCODE;

public class NetworkUtils	// class@0009b5
{

    public void NetworkUtils(){
       super();
    }
    public static int netErrorCode2KitErrorCodeValue(ApiManager$UploadStep p0,NetworkUtils$NetErrorCode p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, NetworkUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (p1 != null) {
          switch (NetworkUtils$1.$SwitchMap$com$kwai$video$ksuploaderkit$network$NetworkUtils$NetErrorCode[p1.ordinal()]){
              case 1:
              case 2:
                if (ApiManager$UploadStep.Apply == p0) {
                   i = KSUploaderKitCommon$ERRORCODE.APPLY_CONNECT_SERVER_FAILED.value();
                }else if(ApiManager$UploadStep.UploadFragment == p0){
                   i = KSUploaderKitCommon$ERRORCODE.HTTP_CLIENT_NETWORK_ERROR.value();
                }else if(ApiManager$UploadStep.UploadFragmentFinished == p0){
                   i = KSUploaderKitCommon$ERRORCODE.HTTP_CLIENT_NETWORK_ERROR.value();
                }else {
                   i = KSUploaderKitCommon$ERRORCODE.PUBLISH_CONNECT_SERVER_FAILED.value();
                }
                break;
              case 3:
                if (ApiManager$UploadStep.Apply == p0) {
                   i = KSUploaderKitCommon$ERRORCODE.APPLY_NOT2XX_HTTP_CODE.value();
                }else if(ApiManager$UploadStep.UploadFragment == p0){
                   i = KSUploaderKitCommon$ERRORCODE.HTTP_UPLOAD_UNEXPECTED_Error.value();
                }else if(ApiManager$UploadStep.UploadFragmentFinished == p0){
                   i = KSUploaderKitCommon$ERRORCODE.HTTP_COMPLETE_UNEXPECTED_Error.value();
                }else {
                   i = KSUploaderKitCommon$ERRORCODE.PUBLISH_NOT2XX_HTTP_CODE.value();
                }
                break;
              case 4:
                i = (ApiManager$UploadStep.Apply == p0)? KSUploaderKitCommon$ERRORCODE.APPLY_PARSER_SERVERINFO_FAILED.value(): KSUploaderKitCommon$ERRORCODE.PUBLISH_PHOTO_FAILED.value();
                break;
              case 5:
                if (ApiManager$UploadStep.Apply == p0) {
                   i = KSUploaderKitCommon$ERRORCODE.APPLY_NOT2XX_HTTP_CODE.value();
                }else if(ApiManager$UploadStep.UploadFragment == p0){
                   i = KSUploaderKitCommon$ERRORCODE.HTTP_UPLOAD_3XX_ERROR.value();
                }else if(ApiManager$UploadStep.UploadFragmentFinished == p0){
                   i = KSUploaderKitCommon$ERRORCODE.HTTP_COMPLETE_3XX_ERROR.value();
                }else {
                   i = KSUploaderKitCommon$ERRORCODE.PUBLISH_NOT2XX_HTTP_CODE.value();
                }
                break;
              case 6:
                if (ApiManager$UploadStep.Apply == p0) {
                   i = KSUploaderKitCommon$ERRORCODE.APPLY_NOT2XX_HTTP_CODE.value();
                }else if(ApiManager$UploadStep.UploadFragment == p0){
                   i = KSUploaderKitCommon$ERRORCODE.HTTP_UPLOAD_4XX_ERROR.value();
                }else if(ApiManager$UploadStep.UploadFragmentFinished == p0){
                   i = KSUploaderKitCommon$ERRORCODE.HTTP_COMPLETE_4XX_ERROR.value();
                }else {
                   i = KSUploaderKitCommon$ERRORCODE.PUBLISH_NOT2XX_HTTP_CODE.value();
                }
                break;
              case 7:
                if (ApiManager$UploadStep.Apply == p0) {
                   i = KSUploaderKitCommon$ERRORCODE.APPLY_NOT2XX_HTTP_CODE.value();
                }else if(ApiManager$UploadStep.UploadFragment == p0){
                   i = KSUploaderKitCommon$ERRORCODE.HTTP_UPLOAD_5XX_ERROR.value();
                }else if(ApiManager$UploadStep.UploadFragmentFinished == p0){
                   i = KSUploaderKitCommon$ERRORCODE.HTTP_COMPLETE_5XX_ERROR.value();
                }else {
                   i = KSUploaderKitCommon$ERRORCODE.PUBLISH_NOT2XX_HTTP_CODE.value();
                }
                break;
              default:
                i = KSUploaderKitCommon$ERRORCODE.UNKNOWN_ERROR.value();
          }
       }
       return i;
    }
}
