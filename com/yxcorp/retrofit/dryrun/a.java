package com.yxcorp.retrofit.dryrun.a;
import okhttp3.Interceptor$Chain;
import okhttp3.Request;
import com.yxcorp.retrofit.dryrun.CommonParamsCompareManager$Type;
import okhttp3.Response;
import java.lang.String;
import java.lang.Object;
import ujd.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.UUID;
import com.yxcorp.retrofit.dryrun.CommonParamsCompareManager;
import okhttp3.Request$Builder;
import ejd.a;
import java.lang.Runnable;

public class a	// class@000965
{

    public static Response a(Interceptor$Chain p0,Request p1,Request p2,boolean p3,boolean p4,CommonParamsCompareManager$Type p5){
       if (p3) {
          String str = "dry_run_tag";
          String str1 = d.a(p1, str);
          if (TextUtils.isEmpty(str1)) {
             str1 = UUID.randomUUID().toString();
             p1 = d.b(p1, str, str1);
             p2 = d.b(p2, str, str1);
          }
          if (!p4) {
             CommonParamsCompareManager.c().e(str1, p2, p5);
             if (p5 == CommonParamsCompareManager$Type.REQUEST_PARAMS) {
                CommonParamsCompareManager.c().f(str1, p2);
             }
          }
          if (p5 == CommonParamsCompareManager$Type.REQUEST_HEADERS) {
             Request request = (p4)? p2: p1;
             CommonParamsCompareManager uCommonParam = CommonParamsCompareManager.c();
             uCommonParam.d(new a(uCommonParam, str1, request.newBuilder().build(), p4));
          }
       }
       if (p4) {
          return p0.proceed(p2);
       }else {
          return p0.proceed(p1);
       }
    }
    public static Response b(Interceptor$Chain p0,Request p1,Request p2,boolean p3,boolean p4,CommonParamsCompareManager$Type p5){
       if (p3) {
          String str = "dry_run_tag";
          String str1 = d.a(p1, str);
          if (TextUtils.isEmpty(str1)) {
             str1 = UUID.randomUUID().toString();
             p1 = d.b(p1, str, str1);
             p2 = d.b(p2, str, str1);
          }
          if (p4) {
             CommonParamsCompareManager.c().e(str1, p2, p5);
          }else if(p5 == CommonParamsCompareManager$Type.REQUEST_PARAMS){
             CommonParamsCompareManager.c().f(str1, p1);
          }
       }
       if (p4) {
          return p0.proceed(p1);
       }else {
          return p0.proceed(p2);
       }
    }
}
