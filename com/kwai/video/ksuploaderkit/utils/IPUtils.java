package com.kwai.video.ksuploaderkit.utils.IPUtils;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse;
import java.util.ArrayList;
import java.util.List;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse$EndPoint;
import android.text.TextUtils;
import com.kwai.video.ksuploaderkit.apicenter.ServerAddress$DnsResolver;
import com.kwai.video.ksuploaderkit.apicenter.ServerAddress;
import java.lang.StringBuilder;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import com.kwai.video.ksuploaderkit.logreporter.UploadLogInfo$DNSResolveStats;
import java.util.Iterator;
import ln.b$a;

public class IPUtils	// class@0009de
{
    public static Pattern VALID_IPV4_PATTERN;
    public static Pattern VALID_IPV6_PATTERN;

    static {
       try{
          IPUtils.VALID_IPV4_PATTERN = Pattern.compile("\(\([01]?\\d\\d?|2[0-4]\\d|25[0-5]\)\\.\){3}\([01]?\\d\\d?|2[0-4]\\d|25[0-5]\)", 2);
          IPUtils.VALID_IPV6_PATTERN = Pattern.compile("\([0-9a-f]{1,4}:\){7}\([0-9a-f]\){1,4}", 2);
       }catch(java.util.regex.PatternSyntaxException e0){
       }
    }
    public void IPUtils(){
       super();
    }
    public static boolean isIpAddress(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IPUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (IPUtils.VALID_IPV4_PATTERN.matcher(p0).matches()) {
          return true;
       }
       return IPUtils.VALID_IPV6_PATTERN.matcher(p0).matches();
    }
    public static ArrayList processDnsResolve(ApiResponse p0){
       ApiResponse$EndPoint host;
       ArrayList uArrayList = null;
       ArrayList obj = PatchProxy.applyOneRefs(p0, uArrayList, IPUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.endpoints != null) {
          obj = new ArrayList();
          int i = 0;
          while (i < p0.endpoints.size()) {
             ApiResponse$EndPoint uEndPoint = p0.endpoints.get(i);
             if (uEndPoint == null || TextUtils.isEmpty(uEndPoint.host)) {
                obj.add(uEndPoint);
             }else {
                host = uEndPoint.host;
                if (!IPUtils.isIpAddress(host)) {
                   if (ServerAddress.getDnsResolver() == null) {
                      KSUploaderKitLog.e("KSUploaderKit-IPUtils", "DNS resolver is null, remove endpoint of "+host);
                      obj.add(uEndPoint);
                   }else {
                      UploadLogInfo$DNSResolveStats uDNSResolveS = IPUtils.resolveHostOfEndPoint(uEndPoint);
                      if (uDNSResolveS != null) {
                         if (uArrayList == null) {
                            uArrayList = new ArrayList();
                         }
                         uArrayList.add(uDNSResolveS);
                      }
                      if (uDNSResolveS == null || uDNSResolveS.success == null) {
                         obj.add(uEndPoint);
                         KSUploaderKitLog.e("KSUploaderKit-IPUtils", host+"resolve failed, mark invalid");
                      }
                   }
                }
             }
             i = i + 1;
          }
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             ApiResponse$EndPoint uEndPoint1 = iterator.next();
             if (uEndPoint1 != null) {
                p0.endpoints.remove(uEndPoint1);
                KSUploaderKitLog.e("KSUploaderKit-IPUtils", "remove invalid endpoint, host : "+uEndPoint1.host+", protocol:"+uEndPoint1.protocol+", port:"+uEndPoint1.port);
             }
          }
       }
       return uArrayList;
    }
    public static void processDnsResolve(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, IPUtils.class, "3")) {
          return;
       }
       if (p0 != null) {
          ArrayList uArrayList = new ArrayList();
          int i = 0;
          while (i < p0.size()) {
             b$a uoa = p0.get(i);
             if (uoa == null || TextUtils.isEmpty(uoa.a)) {
                uArrayList.add(uoa);
             }else {
                b$a a = uoa.a;
                if (!IPUtils.isIpAddress(a)) {
                   if (ServerAddress.getDnsResolver() == null) {
                      KSUploaderKitLog.e("KSUploaderKit-IPUtils", "DNS resolver is null, remove endpoint of "+a);
                      uArrayList.add(uoa);
                   }else {
                      ApiResponse$EndPoint uEndPoint = new ApiResponse$EndPoint(uoa.a, uoa.b, uoa.c);
                      UploadLogInfo$DNSResolveStats uDNSResolveS = IPUtils.resolveHostOfEndPoint(uEndPoint);
                      uoa.a = uEndPoint.host;
                      if (uDNSResolveS == null || uDNSResolveS.success == null) {
                         uArrayList.add(uoa);
                         KSUploaderKitLog.e("KSUploaderKit-IPUtils", a+"resolve failed, mark invalid");
                      }
                   }
                }
             }
             i = i + 1;
          }
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             b$a uoa1 = iterator.next();
             if (uoa1 != null) {
                p0.remove(uoa1);
                KSUploaderKitLog.e("KSUploaderKit-IPUtils", "remove invalid endpoint, host : "+uoa1.a+", protocol:"+uoa1.c+", port:"+uoa1.b);
             }
          }
       }
       return;
    }
    public static UploadLogInfo$DNSResolveStats resolveHostOfEndPoint(ApiResponse$EndPoint p0){
       ApiResponse$EndPoint host;
       UploadLogInfo$DNSResolveStats uDNSResolveS = null;
       Object obj = PatchProxy.applyOneRefs(p0, uDNSResolveS, IPUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KSUploaderKitLog.i("KSUploaderKit-IPUtils", "start dns resolve");
       if (p0 != null && !TextUtils.isEmpty(p0.host)) {
          host = p0.host;
          KSUploaderKitLog.i("KSUploaderKit-IPUtils", "try to resolve:"+host);
          UploadLogInfo$DNSResolveStats uDNSResolveS1 = new UploadLogInfo$DNSResolveStats();
          uDNSResolveS1.host = host;
          ArrayList resolvedIPs = ServerAddress.getDnsResolver().getResolvedIPs(host);
          if (resolvedIPs != null && resolvedIPs.size() > 0) {
             uDNSResolveS1.resolvedIPs = resolvedIPs;
             String str = resolvedIPs.get(0);
             p0.host = str;
             uDNSResolveS1.chosenIP = str;
             uDNSResolveS1.success = true;
             KSUploaderKitLog.i("KSUploaderKit-IPUtils", host+" resolve result: "+resolvedIPs+", choose "+p0.host);
          }
          uDNSResolveS = uDNSResolveS1;
       }else {
          KSUploaderKitLog.e("KSUploaderKit-IPUtils", "host is null");
       }
       return uDNSResolveS;
    }
}
