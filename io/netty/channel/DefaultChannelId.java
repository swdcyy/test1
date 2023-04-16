package io.netty.channel.DefaultChannelId;
import io.netty.channel.ChannelId;
import java.lang.Class;
import ard.b;
import ard.c;
import java.lang.String;
import java.util.regex.Pattern;
import java.util.concurrent.atomic.AtomicInteger;
import zqd.x;
import java.lang.Integer;
import java.lang.Object;
import java.lang.ClassLoader;
import io.netty.util.internal.PlatformDependent;
import zqd.b;
import java.lang.reflect.Method;
import java.lang.Throwable;
import io.netty.util.internal.ThreadLocalRandom;
import java.util.Random;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.Enumeration;
import java.net.NetworkInterface;
import com.kwai.framework.deviceid.a;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.privacykit.interceptor.MacAddressInterceptor;
import java.util.Arrays;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.Long;
import io.netty.buffer.f;

public final class DefaultChannelId implements ChannelId	// class@001078
{
    public String b;
    public String c;
    public final byte[] data;
    public int hashCode;
    public static final boolean $assertionsDisabled = false;
    public static final b d;
    public static final Pattern e;
    public static final byte[] f;
    public static final int g;
    public static final AtomicInteger h;
    public static final long serialVersionUID;

    static {
       int i;
       String str1;
       int i2;
       byte[] uobyteArray;
       LinkedHashMap linkedHashMa;
       InetAddress value;
       byte[] hardwareAddr;
       b d2;
       DefaultChannelId.d = c.a(DefaultChannelId.class);
       DefaultChannelId.e = Pattern.compile("^\(?:[0-9a-fA-F][:-]?\){6,8}$");
       DefaultChannelId.h = new AtomicInteger();
       String str = x.a("io.netty.processId");
       ThreadLocalRandom threadLocalR = 0x400000;
       byte b = -1;
       if (str != null) {
          try{
             i = Integer.parseInt(str);
          }catch(java.lang.NumberFormatException e0){
             i = -1;
          }
          if (i < 0 || i > threadLocalR) {
             DefaultChannelId.d.warn("-Dio.netty.processId: {} \(malformed\)", e0);
          label_0048 :
             i = -1;
          }else {
             d2 = DefaultChannelId.d;
             if (d2.isDebugEnabled()) {
                d2.debug("-Dio.netty.processId: {} \(user-set\)", Integer.valueOf(i));
             }
          }
       }else {
          goto label_0048 ;
       }
       str = "";
       InetAddress obj = null;
       boolean b1 = true;
       if (i < 0) {
          ClassLoader uClassLoader = PlatformDependent.p();
          try{
             Class[] j = b.j;
             Object[] i1 = b.i;
             str1 = Class.forName("java.lang.management.RuntimeMXBean", b1, uClassLoader).getDeclaredMethod("getName", j).invoke(Class.forName("java.lang.management.ManagementFactory", b1, uClassLoader).getMethod("getRuntimeMXBean", j).invoke(obj, i1), i1);
          }catch(java.lang.Exception e7){
             b d = DefaultChannelId.d;
             String str2 = "Could not invoke ManagementFactory.getRuntimeMXBean\(\).getName\(\); Android?";
             try{
                d.debug(str2, e7);
                str1 = Class.forName("android.os.Process", b1, uClassLoader).getMethod("myPid", b.j).invoke(obj, b.i).toString();
             }catch(java.lang.Exception e3){
                DefaultChannelId.d.debug("Could not invoke Process.myPid\(\); not Android?", e3);
                str1 = str;
             }
          }
          i = str1.indexOf(64);
          if (i >= 0) {
             str1 = str1.substring(0, i);
          }
          try{
             i = Integer.parseInt(str1);
          }catch(java.lang.NumberFormatException e0){
             i = -1;
          }
          if (i < 0 || i > threadLocalR) {
             i2 = ThreadLocalRandom.current().nextInt(0x400001);
             DefaultChannelId.d.warn("Failed to find the current process ID from \'{}\'; using a random value: {}", str1, Integer.valueOf(i2));
             i = i2;
          }
          b d1 = DefaultChannelId.d;
          if (d1.isDebugEnabled()) {
             d1.debug("-Dio.netty.processId: {} \(auto-detected\)", Integer.valueOf(i));
          }
       }
       DefaultChannelId.g = i;
       String str3 = x.a("io.netty.machineId");
       if (str3 != null) {
          if (DefaultChannelId.e.matcher(str3).matches()) {
             str = str3.replaceAll("[:-]", e0);
             uobyteArray = new byte[8];
             for (int i3 = 0; i3 < str.length(); i3 = i4) {
                int i4 = i3 + 2;
                uobyteArray[i3] = (byte)Integer.parseInt(str.substring(i3, i4), 16);
             }
             DefaultChannelId.d.debug("-Dio.netty.machineId: {} \(user-set\)", str3);
          label_012b :
             if (uobyteArray == null) {
                byte[] uobyteArray1 = new byte[b1];
                uobyteArray1[0] = b;
                i2 = 4;
                int i5 = 3;
                i3 = 2;
                try{
                   byte[] uobyteArray2 = new byte[i2];
                   uobyteArray2[0] = 127;
                   uobyteArray2[b1] = 0;
                   uobyteArray2[i3] = 0;
                   uobyteArray2[i5] = b1;
                   obj = InetAddress.getByAddress(uobyteArray2);
                }catch(java.net.UnknownHostException e9){
                   PlatformDependent.H(e9);
                }
                try{
                   linkedHashMa = new LinkedHashMap();
                   Enumeration networkInter = NetworkInterface.getNetworkInterfaces();
                   while (networkInter.hasMoreElements()) {
                      NetworkInterface networkInter1 = networkInter.nextElement();
                      Enumeration uEnumeration = a.c(networkInter1);
                      if (uEnumeration.hasMoreElements()) {
                         InetAddress inetAddress = uEnumeration.nextElement();
                         if (!inetAddress.isLoopbackAddress()) {
                            linkedHashMa.put(networkInter1, inetAddress);
                         }
                      }
                   }
                }catch(java.net.SocketException e10){
                   DefaultChannelId.d.warn("Failed to retrieve the list of available network interfaces", e10);
                }
                Iterator iterator = linkedHashMa.entrySet().iterator();
                byte[] uobyteArray3 = uobyteArray1;
                byte i6 = 6;
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   NetworkInterface key = uEntry.getKey();
                   value = uEntry.getValue();
                   if (key.isVirtual()) {
                   }else {
                      try{
                         hardwareAddr = MacAddressInterceptor.getHardwareAddress(key);
                         if (hardwareAddr != null && hardwareAddr.length >= i6) {
                            i6 = hardwareAddr.length;
                            int i7 = 0;
                            while (true) {
                               if (i7 < i6) {
                                  byte b2 = hardwareAddr[i7];
                                  if (b2 && b2 != b1) {
                                     i6 = 0;
                                  label_01c4 :
                                     if (!i6) {
                                        i6 = hardwareAddr[0] & b1;
                                        if (!i6) {
                                           i6 = uobyteArray3[0] & i3;
                                           if (!i6) {
                                              i6 = hardwareAddr[0] & i3;
                                              if (i6) {
                                              label_01d8 :
                                                 i6 = 1;
                                              label_01e2 :
                                                 if (i6 >= 0) {
                                                    if (!i6) {
                                                       i6 = DefaultChannelId.c(obj) - DefaultChannelId.c(value);
                                                       if (i6 >= 0 && (i6 || uobyteArray3.length >= hardwareAddr.length)) {
                                                       }
                                                    }else {
                                                    }
                                                 }
                                              label_01f9 :
                                                 i6 = 1;
                                              label_01fc :
                                                 if (i6) {
                                                    obj = value;
                                                    uobyteArray3 = hardwareAddr;
                                                 }
                                              }
                                           }else {
                                              i6 = hardwareAddr[0] & i3;
                                              if (!i6) {
                                                 i6 = -1;
                                                 goto label_01e2 ;
                                              }
                                           }
                                           i6 = 0;
                                           goto label_01e2 ;
                                        }
                                     }
                                  }else {
                                     i7 = i7 + 1;
                                  }
                               }else {
                                  i6 = 1;
                                  goto label_01c4 ;
                               }
                            }
                         }
                      }catch(java.net.SocketException e11){
                         DefaultChannelId.d.debug("Failed to get the hardware address of a network interface: {}", hardwareAddr, e11);
                         goto label_0189 ;
                      }
                   }
                }
                if (uobyteArray3 == uobyteArray1) {
                   uobyteArray3 = new byte[8];
                   ThreadLocalRandom.current().nextBytes(uobyteArray3);
                   DefaultChannelId.d.warn("Failed to find a usable hardware address from the network interfaces; using random bytes: {}", DefaultChannelId.b(uobyteArray3));
                }
                if (uobyteArray3.length != i6) {
                   uobyteArray1 = Arrays.copyOf(uobyteArray3, 8);
                }else {
                   uobyteArray1 = new byte[8];
                   System.arraycopy(uobyteArray3, 0, uobyteArray1, 0, i5);
                   uobyteArray1[3] = b;
                   uobyteArray1[4] = -2;
                   System.arraycopy(uobyteArray3, i5, uobyteArray1, 5, i5);
                }
                uobyteArray = uobyteArray1;
                d2 = DefaultChannelId.d;
                if (d2.isDebugEnabled()) {
                   d2.debug("-Dio.netty.machineId: {} \(auto-detected\)", DefaultChannelId.b(uobyteArray));
                }
             }
             DefaultChannelId.f = uobyteArray;
          }else {
             DefaultChannelId.d.warn("-Dio.netty.machineId: {} \(malformed\)", str3);
          }
       }
       uobyteArray = obj;
       goto label_012b ;
    }
    public void DefaultChannelId(){
       super();
       byte[] uobyteArray = new byte[28];
       this.data = uobyteArray;
    }
    public static String b(byte[] p0){
       StringBuilder str = new StringBuilder(24);
       int len = p0.length;
       int i = 0;
       int i1 = 1;
       while (i < len) {
          Object[] objArray = new Object[i1];
          int i2 = p0[i] & 0x00ff;
          objArray[0] = Integer.valueOf(i2);
          str = str+String.format("%02x:", objArray);
          i = i + 1;
       }
       return str.substring(0, (str.length() - i1));
    }
    public static int c(InetAddress p0){
       if (p0.isAnyLocalAddress() || p0.isLoopbackAddress()) {
          return 0;
       }
       if (p0.isMulticastAddress()) {
          return 1;
       }
       if (p0.isLinkLocalAddress()) {
          return 2;
       }
       if (p0.isSiteLocalAddress()) {
          return 3;
       }
       return 4;
    }
    public static ChannelId newInstance(){
       DefaultChannelId uDefaultChan = new DefaultChannelId();
       System.arraycopy(DefaultChannelId.f, 0, uDefaultChan.data, 0, 8);
       int i = uDefaultChan.d(uDefaultChan.d(8, DefaultChannelId.g), DefaultChannelId.h.getAndIncrement());
       long l = Long.reverse(System.nanoTime()) ^ System.currentTimeMillis();
       DefaultChannelId data = uDefaultChan.data;
       int i1 = i + 1;
       data[i] = (byte)(int)(l >> 56);
       i = i1 + 1;
       data[i1] = (byte)(int)(l >> 48);
       i1 = i + 1;
       data[i] = (byte)(int)(l >> 40);
       i = i1 + 1;
       data[i1] = (byte)(int)(l >> 32);
       i1 = i + 1;
       data[i] = (byte)(int)(l >> 24);
       i = i1 + 1;
       data[i1] = (byte)(int)(l >> 16);
       i1 = i + 1;
       data[i] = (byte)(int)(l >> 8);
       data[i1] = (byte)(int)l;
       int i2 = ThreadLocalRandom.current().nextInt();
       uDefaultChan.hashCode = i2;
       uDefaultChan.d((i1 + 1), i2);
       return uDefaultChan;
    }
    public final int a(StringBuilder p0,int p1,int p2){
       p0+f.d(this.data, p1, p2)+'-';
       return (p1 + p2);
    }
    public String asLongText(){
       String str;
       DefaultChannelId tc = this.c;
       if (tc == null) {
          str = new StringBuilder(((this.data.length * 2) + 5));
          this.a(str, this.a(str, this.a(str, this.a(str, this.a(str, 0, 8), 4), 4), 8), 4);
          str = str.substring(0, (str.length() - 1));
          this.c = str;
       }
       return str;
    }
    public String asShortText(){
       DefaultChannelId tb = this.b;
       if (tb == null) {
          tb = f.d(this.data, 24, 4);
          this.b = tb;
       }
       return tb;
    }
    public int compareTo(ChannelId p0){
       return 0;
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public final int d(int p0,int p1){
       DefaultChannelId tdata = this.data;
       int i = p0 + 1;
       tdata[p0] = (byte)(p1 >> 24);
       p0 = i + 1;
       tdata[i] = (byte)(p1 >> 16);
       i = p0 + 1;
       tdata[p0] = (byte)(p1 >> 8);
       tdata[i] = (byte)p1;
       return (i + 1);
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof DefaultChannelId) {
          return false;
       }
       return Arrays.equals(this.data, p0.data);
    }
    public int hashCode(){
       return this.hashCode;
    }
    public String toString(){
       return this.asShortText();
    }
}
