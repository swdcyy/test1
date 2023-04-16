package com.oasisfeng.condom.PackageManagerWrapper;
import android.content.pm.PackageManager;
import android.content.IntentFilter;
import android.content.pm.PackageManager$OnPermissionsChangedListener;
import java.lang.String;
import android.content.pm.PermissionInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.IPackageDataObserver;
import android.content.pm.IPackageDeleteObserver;
import android.content.IntentSender;
import android.graphics.drawable.Drawable;
import android.content.pm.ActivityInfo;
import java.util.List;
import android.content.pm.ApplicationInfo;
import android.os.UserHandle;
import java.lang.CharSequence;
import android.content.pm.ChangedPackages;
import com.kwai.privacykit.interceptor.PackageManagerInterceptor;
import android.content.pm.InstrumentationInfo;
import android.content.pm.KeySet;
import android.graphics.Rect;
import android.content.pm.PackageInfo;
import android.content.pm.VersionedPackage;
import android.content.pm.PackageInstaller;
import m0.a;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.content.pm.ServiceInfo;
import android.content.pm.FeatureInfo;
import android.content.res.XmlResourceParser;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager$MoveCallback;
import android.os.Handler;
import android.content.pm.ResolveInfo;

public class PackageManagerWrapper extends PackageManager	// class@000a96
{
    public PackageManager mBase;

    public void PackageManagerWrapper(PackageManager p0){
       super();
       this.mBase = p0;
    }
    public void addCrossProfileIntentFilter(IntentFilter p0,int p1,int p2,int p3){
       this.mBase.addCrossProfileIntentFilter(p0, p1, p2, p3);
    }
    public void addOnPermissionsChangeListener(PackageManager$OnPermissionsChangedListener p0){
       this.mBase.addOnPermissionsChangeListener(p0);
    }
    public void addPackageToPreferred(String p0){
       this.mBase.addPackageToPreferred(p0);
    }
    public boolean addPermission(PermissionInfo p0){
       return this.mBase.addPermission(p0);
    }
    public boolean addPermissionAsync(PermissionInfo p0){
       return this.mBase.addPermissionAsync(p0);
    }
    public void addPreferredActivity(IntentFilter p0,int p1,ComponentName[] p2,ComponentName p3){
       this.mBase.addPreferredActivity(p0, p1, p2, p3);
    }
    public void addPreferredActivityAsUser(IntentFilter p0,int p1,ComponentName[] p2,ComponentName p3,int p4){
       this.mBase.addPreferredActivityAsUser(p0, p1, p2, p3, p4);
    }
    public Intent buildRequestPermissionsIntent(String[] p0){
       return this.mBase.buildRequestPermissionsIntent(p0);
    }
    public boolean canRequestPackageInstalls(){
       return this.mBase.canRequestPackageInstalls();
    }
    public String[] canonicalToCurrentPackageNames(String[] p0){
       return this.mBase.canonicalToCurrentPackageNames(p0);
    }
    public int checkPermission(String p0,String p1){
       return this.mBase.checkPermission(p0, p1);
    }
    public int checkSignatures(int p0,int p1){
       return this.mBase.checkSignatures(p0, p1);
    }
    public int checkSignatures(String p0,String p1){
       return this.mBase.checkSignatures(p0, p1);
    }
    public void clearApplicationUserData(String p0,IPackageDataObserver p1){
       this.mBase.clearApplicationUserData(p0, p1);
    }
    public void clearCrossProfileIntentFilters(int p0){
       this.mBase.clearCrossProfileIntentFilters(p0);
    }
    public void clearInstantAppCookie(){
       this.mBase.clearInstantAppCookie();
    }
    public void clearPackagePreferredActivities(String p0){
       this.mBase.clearPackagePreferredActivities(p0);
    }
    public String[] currentToCanonicalPackageNames(String[] p0){
       return this.mBase.currentToCanonicalPackageNames(p0);
    }
    public void deleteApplicationCacheFiles(String p0,IPackageDataObserver p1){
       this.mBase.deleteApplicationCacheFiles(p0, p1);
    }
    public void deleteApplicationCacheFilesAsUser(String p0,int p1,IPackageDataObserver p2){
       this.mBase.deleteApplicationCacheFilesAsUser(p0, p1, p2);
    }
    public void deletePackage(String p0,IPackageDeleteObserver p1,int p2){
       this.mBase.deletePackage(p0, p1, p2);
    }
    public void deletePackageAsUser(String p0,IPackageDeleteObserver p1,int p2,int p3){
       this.mBase.deletePackageAsUser(p0, p1, p2, p3);
    }
    public void extendVerificationTimeout(int p0,int p1,long p2){
       this.mBase.extendVerificationTimeout(p0, p1, p2);
    }
    public void flushPackageRestrictionsAsUser(int p0){
       this.mBase.flushPackageRestrictionsAsUser(p0);
    }
    public void freeStorage(long p0,IntentSender p1){
       this.mBase.freeStorage(p0, p1);
    }
    public void freeStorage(String p0,long p1,IntentSender p2){
       this.mBase.freeStorage(p0, p1, p2);
    }
    public void freeStorageAndNotify(long p0,IPackageDataObserver p1){
       this.mBase.freeStorageAndNotify(p0, p1);
    }
    public void freeStorageAndNotify(String p0,long p1,IPackageDataObserver p2){
       this.mBase.freeStorageAndNotify(p0, p1, p2);
    }
    public Drawable getActivityBanner(ComponentName p0){
       return this.mBase.getActivityBanner(p0);
    }
    public Drawable getActivityBanner(Intent p0){
       return this.mBase.getActivityBanner(p0);
    }
    public Drawable getActivityIcon(ComponentName p0){
       return this.mBase.getActivityIcon(p0);
    }
    public Drawable getActivityIcon(Intent p0){
       return this.mBase.getActivityIcon(p0);
    }
    public ActivityInfo getActivityInfo(ComponentName p0,int p1){
       return this.mBase.getActivityInfo(p0, p1);
    }
    public Drawable getActivityLogo(ComponentName p0){
       return this.mBase.getActivityLogo(p0);
    }
    public Drawable getActivityLogo(Intent p0){
       return this.mBase.getActivityLogo(p0);
    }
    public List getAllIntentFilters(String p0){
       return this.mBase.getAllIntentFilters(p0);
    }
    public List getAllPermissionGroups(int p0){
       return this.mBase.getAllPermissionGroups(p0);
    }
    public Drawable getApplicationBanner(ApplicationInfo p0){
       return this.mBase.getApplicationBanner(p0);
    }
    public Drawable getApplicationBanner(String p0){
       return this.mBase.getApplicationBanner(p0);
    }
    public int getApplicationEnabledSetting(String p0){
       return this.mBase.getApplicationEnabledSetting(p0);
    }
    public boolean getApplicationHiddenSettingAsUser(String p0,UserHandle p1){
       return this.mBase.getApplicationHiddenSettingAsUser(p0, p1);
    }
    public Drawable getApplicationIcon(ApplicationInfo p0){
       return this.mBase.getApplicationIcon(p0);
    }
    public Drawable getApplicationIcon(String p0){
       return this.mBase.getApplicationIcon(p0);
    }
    public ApplicationInfo getApplicationInfo(String p0,int p1){
       return this.mBase.getApplicationInfo(p0, p1);
    }
    public ApplicationInfo getApplicationInfoAsUser(String p0,int p1,int p2){
       return this.mBase.getApplicationInfoAsUser(p0, p1, p2);
    }
    public CharSequence getApplicationLabel(ApplicationInfo p0){
       return this.mBase.getApplicationLabel(p0);
    }
    public Drawable getApplicationLogo(ApplicationInfo p0){
       return this.mBase.getApplicationLogo(p0);
    }
    public Drawable getApplicationLogo(String p0){
       return this.mBase.getApplicationLogo(p0);
    }
    public ChangedPackages getChangedPackages(int p0){
       return this.mBase.getChangedPackages(p0);
    }
    public int getComponentEnabledSetting(ComponentName p0){
       return this.mBase.getComponentEnabledSetting(p0);
    }
    public Drawable getDefaultActivityIcon(){
       return this.mBase.getDefaultActivityIcon();
    }
    public String getDefaultBrowserPackageNameAsUser(int p0){
       return this.mBase.getDefaultBrowserPackageNameAsUser(p0);
    }
    public Drawable getDrawable(String p0,int p1,ApplicationInfo p2){
       return this.mBase.getDrawable(p0, p1, p2);
    }
    public Drawable getEphemeralApplicationIcon(String p0){
       return this.mBase.getEphemeralApplicationIcon(p0);
    }
    public byte[] getEphemeralCookie(){
       return this.mBase.getEphemeralCookie();
    }
    public int getEphemeralCookieMaxSizeBytes(){
       return this.mBase.getEphemeralCookieMaxSizeBytes();
    }
    public ComponentName getHomeActivities(List p0){
       return this.mBase.getHomeActivities(p0);
    }
    public List getInstalledApplications(int p0){
       return PackageManagerInterceptor.getInstalledApplications(this.mBase, p0);
    }
    public List getInstalledPackages(int p0){
       return PackageManagerInterceptor.getInstalledPackages(this.mBase, p0);
    }
    public List getInstalledPackagesAsUser(int p0,int p1){
       return this.mBase.getInstalledPackagesAsUser(p0, p1);
    }
    public String getInstallerPackageName(String p0){
       return this.mBase.getInstallerPackageName(p0);
    }
    public byte[] getInstantAppCookie(){
       return this.mBase.getInstantAppCookie();
    }
    public int getInstantAppCookieMaxBytes(){
       return this.mBase.getInstantAppCookieMaxBytes();
    }
    public InstrumentationInfo getInstrumentationInfo(ComponentName p0,int p1){
       return this.mBase.getInstrumentationInfo(p0, p1);
    }
    public int getIntentVerificationStatusAsUser(String p0,int p1){
       return this.mBase.getIntentVerificationStatusAsUser(p0, p1);
    }
    public KeySet getKeySetByAlias(String p0,String p1){
       return this.mBase.getKeySetByAlias(p0, p1);
    }
    public Intent getLaunchIntentForPackage(String p0){
       return this.mBase.getLaunchIntentForPackage(p0);
    }
    public Intent getLeanbackLaunchIntentForPackage(String p0){
       return this.mBase.getLeanbackLaunchIntentForPackage(p0);
    }
    public Drawable getManagedUserBadgedDrawable(Drawable p0,Rect p1,int p2){
       return this.mBase.getManagedUserBadgedDrawable(p0, p1, p2);
    }
    public int getMoveStatus(int p0){
       return this.mBase.getMoveStatus(p0);
    }
    public String getNameForUid(int p0){
       return this.mBase.getNameForUid(p0);
    }
    public PackageInfo getPackageArchiveInfo(String p0,int p1){
       return this.mBase.getPackageArchiveInfo(p0, p1);
    }
    public int[] getPackageGids(String p0){
       return this.mBase.getPackageGids(p0);
    }
    public int[] getPackageGids(String p0,int p1){
       return this.mBase.getPackageGids(p0, p1);
    }
    public PackageInfo getPackageInfo(VersionedPackage p0,int p1){
       return this.mBase.getPackageInfo(p0, p1);
    }
    public PackageInfo getPackageInfo(String p0,int p1){
       return this.mBase.getPackageInfo(p0, p1);
    }
    public PackageInfo getPackageInfoAsUser(String p0,int p1,int p2){
       return this.mBase.getPackageInfoAsUser(p0, p1, p2);
    }
    public PackageInstaller getPackageInstaller(){
       return this.mBase.getPackageInstaller();
    }
    public void getPackageSizeInfo(String p0,a p1){
       this.mBase.getPackageSizeInfo(p0, p1);
    }
    public void getPackageSizeInfoAsUser(String p0,int p1,a p2){
       this.mBase.getPackageSizeInfoAsUser(p0, p1, p2);
    }
    public int getPackageUid(String p0,int p1){
       return this.mBase.getPackageUid(p0, p1);
    }
    public int getPackageUidAsUser(String p0,int p1){
       return this.mBase.getPackageUidAsUser(p0, p1);
    }
    public int getPackageUidAsUser(String p0,int p1,int p2){
       return this.mBase.getPackageUidAsUser(p0, p1, p2);
    }
    public String[] getPackagesForUid(int p0){
       return this.mBase.getPackagesForUid(p0);
    }
    public List getPackagesHoldingPermissions(String[] p0,int p1){
       return this.mBase.getPackagesHoldingPermissions(p0, p1);
    }
    public String getPermissionControllerPackageName(){
       return this.mBase.getPermissionControllerPackageName();
    }
    public int getPermissionFlags(String p0,String p1,UserHandle p2){
       return this.mBase.getPermissionFlags(p0, p1, p2);
    }
    public PermissionGroupInfo getPermissionGroupInfo(String p0,int p1){
       return this.mBase.getPermissionGroupInfo(p0, p1);
    }
    public PermissionInfo getPermissionInfo(String p0,int p1){
       return this.mBase.getPermissionInfo(p0, p1);
    }
    public int getPreferredActivities(List p0,List p1,String p2){
       return this.mBase.getPreferredActivities(p0, p1, p2);
    }
    public List getPreferredPackages(int p0){
       return this.mBase.getPreferredPackages(p0);
    }
    public ProviderInfo getProviderInfo(ComponentName p0,int p1){
       return this.mBase.getProviderInfo(p0, p1);
    }
    public ActivityInfo getReceiverInfo(ComponentName p0,int p1){
       return this.mBase.getReceiverInfo(p0, p1);
    }
    public Resources getResourcesForActivity(ComponentName p0){
       return this.mBase.getResourcesForActivity(p0);
    }
    public Resources getResourcesForApplication(ApplicationInfo p0){
       return this.mBase.getResourcesForApplication(p0);
    }
    public Resources getResourcesForApplication(String p0){
       return this.mBase.getResourcesForApplication(p0);
    }
    public Resources getResourcesForApplicationAsUser(String p0,int p1){
       return this.mBase.getResourcesForApplicationAsUser(p0, p1);
    }
    public ServiceInfo getServiceInfo(ComponentName p0,int p1){
       return this.mBase.getServiceInfo(p0, p1);
    }
    public String getServicesSystemSharedLibraryPackageName(){
       return this.mBase.getServicesSystemSharedLibraryPackageName();
    }
    public List getSharedLibraries(int p0){
       return this.mBase.getSharedLibraries(p0);
    }
    public String getSharedSystemSharedLibraryPackageName(){
       return this.mBase.getSharedSystemSharedLibraryPackageName();
    }
    public KeySet getSigningKeySet(String p0){
       return this.mBase.getSigningKeySet(p0);
    }
    public FeatureInfo[] getSystemAvailableFeatures(){
       return this.mBase.getSystemAvailableFeatures();
    }
    public String[] getSystemSharedLibraryNames(){
       return this.mBase.getSystemSharedLibraryNames();
    }
    public CharSequence getText(String p0,int p1,ApplicationInfo p2){
       return this.mBase.getText(p0, p1, p2);
    }
    public int getUidForSharedUser(String p0){
       return this.mBase.getUidForSharedUser(p0);
    }
    public Drawable getUserBadgeForDensity(UserHandle p0,int p1){
       return this.mBase.getUserBadgeForDensity(p0, p1);
    }
    public Drawable getUserBadgeForDensityNoBackground(UserHandle p0,int p1){
       return this.mBase.getUserBadgeForDensityNoBackground(p0, p1);
    }
    public Drawable getUserBadgedDrawableForDensity(Drawable p0,UserHandle p1,Rect p2,int p3){
       return this.mBase.getUserBadgedDrawableForDensity(p0, p1, p2, p3);
    }
    public Drawable getUserBadgedIcon(Drawable p0,UserHandle p1){
       return this.mBase.getUserBadgedIcon(p0, p1);
    }
    public CharSequence getUserBadgedLabel(CharSequence p0,UserHandle p1){
       return this.mBase.getUserBadgedLabel(p0, p1);
    }
    public XmlResourceParser getXml(String p0,int p1,ApplicationInfo p2){
       return this.mBase.getXml(p0, p1, p2);
    }
    public void grantRuntimePermission(String p0,String p1,UserHandle p2){
       this.mBase.grantRuntimePermission(p0, p1, p2);
    }
    public boolean hasSystemFeature(String p0){
       return this.mBase.hasSystemFeature(p0);
    }
    public boolean hasSystemFeature(String p0,int p1){
       return this.mBase.hasSystemFeature(p0, p1);
    }
    public int installExistingPackage(String p0){
       return this.mBase.installExistingPackage(p0);
    }
    public int installExistingPackageAsUser(String p0,int p1){
       return this.mBase.installExistingPackageAsUser(p0, p1);
    }
    public boolean isEphemeralApplication(){
       return this.mBase.isEphemeralApplication();
    }
    public boolean isInstantApp(){
       return this.mBase.isInstantApp();
    }
    public boolean isInstantApp(String p0){
       return this.mBase.isInstantApp(p0);
    }
    public boolean isPackageAvailable(String p0){
       return this.mBase.isPackageAvailable(p0);
    }
    public boolean isPackageSuspendedForUser(String p0,int p1){
       return this.mBase.isPackageSuspendedForUser(p0, p1);
    }
    public boolean isPermissionRevokedByPolicy(String p0,String p1){
       return this.mBase.isPermissionRevokedByPolicy(p0, p1);
    }
    public boolean isSafeMode(){
       return this.mBase.isSafeMode();
    }
    public boolean isSignedBy(String p0,KeySet p1){
       return this.mBase.isSignedBy(p0, p1);
    }
    public boolean isSignedByExactly(String p0,KeySet p1){
       return this.mBase.isSignedByExactly(p0, p1);
    }
    public boolean isUpgrade(){
       return this.mBase.isUpgrade();
    }
    public Drawable loadItemIcon(PackageItemInfo p0,ApplicationInfo p1){
       return this.mBase.loadItemIcon(p0, p1);
    }
    public Drawable loadUnbadgedItemIcon(PackageItemInfo p0,ApplicationInfo p1){
       return this.mBase.loadUnbadgedItemIcon(p0, p1);
    }
    public List queryBroadcastReceivers(Intent p0,int p1){
       return this.mBase.queryBroadcastReceivers(p0, p1);
    }
    public List queryBroadcastReceivers(Intent p0,int p1,int p2){
       return this.mBase.queryBroadcastReceivers(p0, p1, p2);
    }
    public List queryBroadcastReceiversAsUser(Intent p0,int p1,int p2){
       return this.mBase.queryBroadcastReceiversAsUser(p0, p1, p2);
    }
    public List queryBroadcastReceiversAsUser(Intent p0,int p1,UserHandle p2){
       return this.mBase.queryBroadcastReceiversAsUser(p0, p1, p2);
    }
    public List queryContentProviders(String p0,int p1,int p2){
       return this.mBase.queryContentProviders(p0, p1, p2);
    }
    public List queryInstrumentation(String p0,int p1){
       return this.mBase.queryInstrumentation(p0, p1);
    }
    public List queryIntentActivities(Intent p0,int p1){
       return this.mBase.queryIntentActivities(p0, p1);
    }
    public List queryIntentActivitiesAsUser(Intent p0,int p1,int p2){
       return this.mBase.queryIntentActivitiesAsUser(p0, p1, p2);
    }
    public List queryIntentActivityOptions(ComponentName p0,Intent[] p1,Intent p2,int p3){
       return this.mBase.queryIntentActivityOptions(p0, p1, p2, p3);
    }
    public List queryIntentContentProviders(Intent p0,int p1){
       return this.mBase.queryIntentContentProviders(p0, p1);
    }
    public List queryIntentContentProvidersAsUser(Intent p0,int p1,int p2){
       return this.mBase.queryIntentContentProvidersAsUser(p0, p1, p2);
    }
    public List queryIntentServices(Intent p0,int p1){
       return this.mBase.queryIntentServices(p0, p1);
    }
    public List queryIntentServicesAsUser(Intent p0,int p1,int p2){
       return this.mBase.queryIntentServicesAsUser(p0, p1, p2);
    }
    public List queryPermissionsByGroup(String p0,int p1){
       return this.mBase.queryPermissionsByGroup(p0, p1);
    }
    public void registerMoveCallback(PackageManager$MoveCallback p0,Handler p1){
       this.mBase.registerMoveCallback(p0, p1);
    }
    public void removeOnPermissionsChangeListener(PackageManager$OnPermissionsChangedListener p0){
       this.mBase.removeOnPermissionsChangeListener(p0);
    }
    public void removePackageFromPreferred(String p0){
       this.mBase.removePackageFromPreferred(p0);
    }
    public void removePermission(String p0){
       this.mBase.removePermission(p0);
    }
    public void replacePreferredActivity(IntentFilter p0,int p1,ComponentName[] p2,ComponentName p3){
       this.mBase.replacePreferredActivity(p0, p1, p2, p3);
    }
    public void replacePreferredActivityAsUser(IntentFilter p0,int p1,ComponentName[] p2,ComponentName p3,int p4){
       this.mBase.replacePreferredActivityAsUser(p0, p1, p2, p3, p4);
    }
    public ResolveInfo resolveActivity(Intent p0,int p1){
       return this.mBase.resolveActivity(p0, p1);
    }
    public ResolveInfo resolveActivityAsUser(Intent p0,int p1,int p2){
       return this.mBase.resolveActivityAsUser(p0, p1, p2);
    }
    public ProviderInfo resolveContentProvider(String p0,int p1){
       return this.mBase.resolveContentProvider(p0, p1);
    }
    public ProviderInfo resolveContentProviderAsUser(String p0,int p1,int p2){
       return this.mBase.resolveContentProviderAsUser(p0, p1, p2);
    }
    public ResolveInfo resolveService(Intent p0,int p1){
       return this.mBase.resolveService(p0, p1);
    }
    public void revokeRuntimePermission(String p0,String p1,UserHandle p2){
       this.mBase.revokeRuntimePermission(p0, p1, p2);
    }
    public void setApplicationCategoryHint(String p0,int p1){
       this.mBase.setApplicationCategoryHint(p0, p1);
    }
    public void setApplicationEnabledSetting(String p0,int p1,int p2){
       this.mBase.setApplicationEnabledSetting(p0, p1, p2);
    }
    public boolean setApplicationHiddenSettingAsUser(String p0,boolean p1,UserHandle p2){
       return this.mBase.setApplicationHiddenSettingAsUser(p0, p1, p2);
    }
    public void setComponentEnabledSetting(ComponentName p0,int p1,int p2){
       this.mBase.setComponentEnabledSetting(p0, p1, p2);
    }
    public boolean setDefaultBrowserPackageNameAsUser(String p0,int p1){
       return this.mBase.setDefaultBrowserPackageNameAsUser(p0, p1);
    }
    public boolean setEphemeralCookie(byte[] p0){
       return this.mBase.setEphemeralCookie(p0);
    }
    public void setInstallerPackageName(String p0,String p1){
       this.mBase.setInstallerPackageName(p0, p1);
    }
    public String[] setPackagesSuspendedAsUser(String[] p0,boolean p1,int p2){
       return this.mBase.setPackagesSuspendedAsUser(p0, p1, p2);
    }
    public boolean shouldShowRequestPermissionRationale(String p0){
       return this.mBase.shouldShowRequestPermissionRationale(p0);
    }
    public void unregisterMoveCallback(PackageManager$MoveCallback p0){
       this.mBase.unregisterMoveCallback(p0);
    }
    public void updateInstantAppCookie(byte[] p0){
       this.mBase.updateInstantAppCookie(p0);
    }
    public boolean updateIntentVerificationStatusAsUser(String p0,int p1,int p2){
       return this.mBase.updateIntentVerificationStatusAsUser(p0, p1, p2);
    }
    public void updatePermissionFlags(String p0,String p1,int p2,int p3,UserHandle p4){
       this.mBase.updatePermissionFlags(p0, p1, p2, p3, p4);
    }
    public void verifyIntentFilter(int p0,int p1,List p2){
       this.mBase.verifyIntentFilter(p0, p1, p2);
    }
    public void verifyPendingInstall(int p0,int p1){
       this.mBase.verifyPendingInstall(p0, p1);
    }
}
