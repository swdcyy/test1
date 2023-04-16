package com.oasisfeng.condom.CondomPackageManager;
import com.oasisfeng.condom.PackageManagerWrapper;
import com.oasisfeng.condom.CondomPackageManager$8;
import com.oasisfeng.condom.CondomCore;
import android.content.pm.PackageManager;
import java.lang.String;
import android.content.Intent;
import java.util.List;
import android.content.pm.ResolveInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.oasisfeng.condom.OutboundType;
import java.lang.Integer;
import com.oasisfeng.condom.CondomPackageManager$7;
import java.lang.Object;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedureThrows;
import com.oasisfeng.condom.CondomPackageManager$4;
import com.kwai.privacykit.interceptor.PackageManagerInterceptor;
import com.oasisfeng.condom.CondomPackageManager$5;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageInstaller;
import java.lang.UnsupportedOperationException;
import com.oasisfeng.condom.CondomPackageManager$6;
import com.oasisfeng.condom.CondomCore$Function;
import com.oasisfeng.condom.CondomPackageManager$1;
import com.oasisfeng.condom.CondomPackageManager$2;
import android.content.pm.ProviderInfo;
import com.oasisfeng.condom.CondomPackageManager$3;

public class CondomPackageManager extends PackageManagerWrapper	// class@000a88
{
    public final CondomCore a;
    public final String b;
    public static final CondomCore$Function c;

    static {
       CondomPackageManager.c = new CondomPackageManager$8();
    }
    public void CondomPackageManager(CondomCore p0,PackageManager p1,String p2){
       super(p1);
       this.a = p0;
       this.b = p2;
    }
    public static List a(CondomPackageManager p0,Intent p1,int p2){
       return super.queryBroadcastReceivers(p1, p2);
    }
    public static List b(CondomPackageManager p0,Intent p1,int p2){
       return super.queryIntentServices(p1, p2);
    }
    public static ResolveInfo c(CondomPackageManager p0,Intent p1,int p2){
       return super.resolveService(p1, p2);
    }
    public static List d(CondomPackageManager p0,Intent p1,int p2){
       return super.queryIntentServices(p1, p2);
    }
    public static ApplicationInfo e(CondomPackageManager p0,String p1,int p2){
       return super.getApplicationInfo(p1, p2);
    }
    public static PackageInfo f(CondomPackageManager p0,String p1,int p2){
       return super.getPackageInfo(p1, p2);
    }
    public static String[] g(CondomPackageManager p0,int p1){
       return super.getPackagesForUid(p1);
    }
    public static int h(CondomPackageManager p0,String p1,String p2){
       return super.checkPermission(p1, p2);
    }
    public int checkPermission(String p0,String p1){
       return this.a.proceed(OutboundType.CHECK_PERMISSION, p1, Integer.valueOf(-1), new CondomPackageManager$7(this, p0, p1)).intValue();
    }
    public ApplicationInfo getApplicationInfo(String p0,int p1){
       return this.a.proceed(OutboundType.GET_APPLICATION_INFO, p0, null, new CondomPackageManager$4(this, p0, p1));
    }
    public List getInstalledApplications(int p0){
       this.a.logConcern(this.b, "PackageManager.getInstalledApplications");
       return PackageManagerInterceptor.getInstalledApplications(this, p0);
    }
    public List getInstalledPackages(int p0){
       this.a.logConcern(this.b, "PackageManager.getInstalledPackages");
       return PackageManagerInterceptor.getInstalledPackages(this, p0);
    }
    public PackageInfo getPackageInfo(String p0,int p1){
       PackageInfo packageInfo = this.a.proceed(OutboundType.GET_PACKAGE_INFO, p0, null, new CondomPackageManager$5(this, p0, p1));
       if (packageInfo == null) {
          throw new PackageManager$NameNotFoundException(p0);
       }
       if ((p1 & 0x1000) && (!this.a.getSpoofPermissions().isEmpty() && (this.a.getPackageName()).equals(p0))) {
          ArrayList uArrayList = (packageInfo.requestedPermissions == null)? new ArrayList(): new ArrayList(Arrays.asList(packageInfo.requestedPermissions));
          ArrayList uArrayList1 = new ArrayList(this.a.getSpoofPermissions());
          uArrayList1.removeAll(uArrayList);
          if (!uArrayList1.isEmpty()) {
             uArrayList.addAll(uArrayList1);
             String[] stringArray = new String[uArrayList.size()];
             packageInfo.requestedPermissions = uArrayList.toArray(stringArray);
          }
          PackageInfo requestedPer = packageInfo.requestedPermissionsFlags;
          int[] ointArray = (requestedPer == null)? new int[uArrayList.size()]: Arrays.copyOf(requestedPer, uArrayList.size());
          requestedPer = 0;
          PackageInfo requestedPer1 = packageInfo.requestedPermissions;
          while (requestedPer < requestedPer1.length) {
             if (this.a.shouldSpoofPermission(requestedPer1[requestedPer])) {
                ointArray[requestedPer] = 2;
             }
             requestedPer++;
          }
          packageInfo.requestedPermissionsFlags = ointArray;
       }
    label_0093 :
       return packageInfo;
    }
    public PackageInstaller getPackageInstaller(){
       throw new UnsupportedOperationException("PackageManager.getPackageInstaller\(\) is not yet supported by Project Condom. If it causes trouble, please file an issue on GitHub.");
    }
    public String[] getPackagesForUid(int p0){
       Intent intent = null;
       List list = this.a.proceedQuery(OutboundType.QUERY_PACKAGES, intent, new CondomPackageManager$6(this, p0), CondomPackageManager.c);
       if (list != null && !list.isEmpty()) {
          String[] stringArray = new String[0];
          intent = list.toArray(stringArray);
       }
       return intent;
    }
    public List queryBroadcastReceivers(Intent p0,int p1){
       return this.a.proceedQuery(OutboundType.QUERY_RECEIVERS, p0, new CondomPackageManager$1(this, p0, p1), CondomCore.RECEIVER_PACKAGE_GETTER);
    }
    public List queryIntentServices(Intent p0,int p1){
       return this.a.proceedQuery(OutboundType.QUERY_SERVICES, p0, new CondomPackageManager$2(this, p0, p1, p0.getFlags()), CondomCore.SERVICE_PACKAGE_GETTER);
    }
    public ProviderInfo resolveContentProvider(String p0,int p1){
       ProviderInfo providerInfo = super.resolveContentProvider(p0, p1);
       if (!this.a.shouldAllowProvider(providerInfo)) {
          providerInfo = null;
       }
       return providerInfo;
    }
    public ResolveInfo resolveService(Intent p0,int p1){
       return this.a.proceed(OutboundType.QUERY_SERVICES, p0, null, new CondomPackageManager$3(this, p0, p1, p0.getFlags()));
    }
}
