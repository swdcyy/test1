package com.kwai.chat.kwailink.adapter.KlinkConfig;
import com.kwai.link.IKlinkConfig;
import com.kwai.chat.kwailink.base.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import n75.b;
import z27.a;
import q75.b;
import q75.c;
import java.util.ArrayList;
import java.util.List;
import com.kwai.chat.kwailink.config.KwaiLinkDefaultServerInfo;
import java.util.Iterator;
import d85.g;
import q75.a;
import java.lang.Boolean;

public class KlinkConfig implements IKlinkConfig	// class@000a05
{
    public static int sTotalRaceCountLimit;

    static {
       int i;
       b obj = PatchProxy.apply(null, null, b.class, "9");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = b.b;
          i = (obj != null)? obj.i: 0;
       }
       KlinkConfig.sTotalRaceCountLimit = i;
    }
    public void KlinkConfig(){
       super();
    }
    public long aggressiveHeartbeatTransferTimeout(){
       return a.a(this);
    }
    public long aggressivePingTransferTimeout(){
       return a.b(this);
    }
    public long backgroundHeartbeatInterval(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (long)0x18b820;
    }
    public int concurrentRaceCountLimit(){
       return a.d(this);
    }
    public long connectTimeout(){
       return a.e(this);
    }
    public long defaultCacheTimeout(){
       return a.f(this);
    }
    public long defaultTransferTimeout(){
       return a.g(this);
    }
    public long foregroundHeartbeatIntervalForTcp(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "17");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = PatchProxy.apply(null, null, b.class, "5");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else if(b.j){
          i = b.k;
       }else {
          i = b.c();
       }
       return (long)i;
    }
    public int[] getDefaultIpv4QuicPorts(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.b().a();
    }
    public int[] getDefaultIpv4TcpPorts(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.b().a();
    }
    public int[] getDefaultIpv6QuicPorts(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.b().a();
    }
    public int[] getDefaultIpv6TcpPorts(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.b().a();
    }
    public String[] getFallbackDomains(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, KlinkConfig.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       c uoc = c.b();
       _monitor_enter(uoc);
       ArrayList uArrayList = PatchProxy.apply(objArray, uoc, c.class, "5");
       if (uArrayList != patchProxyRe) {
       }else {
          c a = uoc.a;
          ArrayList uArrayList1 = (a == null)? new ArrayList(): a.c();
          uArrayList = uArrayList1;
       }
       _monitor_exit(uoc);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().a());
       }
       String[] stringArray = new String[0];
       return obj.toArray(stringArray);
    }
    public String[] getFallbackIpv4QuicIps(){
       return a.n(this);
    }
    public String[] getFallbackIpv4TcpIps(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, KlinkConfig.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       c uoc = c.b();
       _monitor_enter(uoc);
       ArrayList uArrayList = PatchProxy.apply(objArray, uoc, c.class, "6");
       if (uArrayList != patchProxyRe) {
       }else {
          c a = uoc.a;
          ArrayList uArrayList1 = (a == null)? new ArrayList(): a.d();
          uArrayList = uArrayList1;
       }
       _monitor_exit(uoc);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().a());
       }
       String[] stringArray = new String[0];
       return obj.toArray(stringArray);
    }
    public String[] getFallbackIpv6QuicIps(){
       return a.p(this);
    }
    public String[] getFallbackIpv6TcpIps(){
       return a.q(this);
    }
    public String getQuicConfig(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.e("klink_quic_config_android_v2", b.j);
    }
    public String getTraceConfig(){
       b b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, this, KlinkConfig.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, objArray, b.class, "10");
       if (obj != patchProxyRe) {
       }else {
          b = b.b;
          if (b != null) {
             objArray = b.j;
          }
          obj = objArray;
       }
       return obj;
    }
    public long heartbeatInterval(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (long)b.c();
    }
    public boolean isBackgroundHeartbeatIntervalEnabled(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.l;
    }
    public boolean isDelayHeartbeatEnabled(){
       return false;
    }
    public boolean isFastLoginEnabled(){
       return true;
    }
    public boolean isPersistAccountInfoEnabled(){
       return true;
    }
    public boolean isPingForSleepEnabled(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.a() ^ 0x01);
    }
    public boolean isPushStatEnabled(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.a("klink_enable_push_stat", b) || a.a("klink_enable_push_stat_huidu", b)) {
          b = true;
       }
       return b;
    }
    public boolean isQuicBlockEnabled(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.a("klink_enable_quic_block", b) || a.a("klink_enable_quic_block_huidu", b)) {
          b = true;
       }
       return b;
    }
    public boolean isQuicEnabled(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.a("new_klink_use_quic_android", b.j()) || a.a("new_klink_use_quic_android_huidu", b.j()))? true: false;
       return b;
    }
    public boolean isSampleBasicMessageEnabled(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.a("kwailink_sample_basic_message", b) || a.a("kwailink_sample_basic_message_huidu", b)) {
          b = true;
       }
       return b;
    }
    public boolean isSleepModeEnabled(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.a("klink_enable_sleep_mode", b) || a.a("klink_enable_sleep_mode_huidu", b)) {
          b = true;
       }
       return b;
    }
    public boolean isTcpEnabled(){
       return a.E(this);
    }
    public boolean isTraceEnabled(){
       return true;
    }
    public boolean isTransportLayerKeepaliveEnabled(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.f;
    }
    public long pingTransferTimeout(){
       return a.H(this);
    }
    public double pushStatSampleRate(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       if (a.a("klink_enable_push_stat_huidu", false)) {
          return a.b("klink_push_stat_sample_rate_huidu", 0);
       }
       return a.b("klink_push_stat_sample_rate", 0);
    }
    public long quicBlockInterval(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 24;
       l = (a.a("klink_enable_quic_block_huidu", false))? a.d("klink_quic_block_interval_huidu", l): a.d("klink_quic_block_interval", l);
       return ((l * 3600) * 1000);
    }
    public int quicBlockThreshold(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (a.a("klink_enable_quic_block_huidu", false)) {
          return a.c("klink_quic_block_threshold_huidu", 3);
       }
       return a.c("klink_quic_block_threshold", 3);
    }
    public long sleepDelay(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (a.a("klink_enable_sleep_mode_huidu", false)) {
          return a.d("klink_sleep_delay_huidu", 0x2bf20);
       }
       return a.d("klink_sleep_delay", 0x2bf20);
    }
    public int totalRaceCountLimit(){
       return KlinkConfig.sTotalRaceCountLimit;
    }
    public String transportLayerKeepaliveConfig(){
       Object obj = PatchProxy.apply(null, this, KlinkConfig.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.g;
    }
}
