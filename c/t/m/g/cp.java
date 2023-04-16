package c.t.m.g.cp;
import android.bluetooth.le.ScanCallback;
import android.content.Context;
import java.util.LinkedList;
import c.t.m.g.ed;
import java.lang.String;
import java.lang.Object;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.ScanSettings$Builder;
import android.bluetooth.le.ScanSettings;
import java.util.ArrayList;
import android.bluetooth.le.ScanFilter;
import java.util.List;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanResult;
import android.os.Handler;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import c.t.m.g.de;
import android.os.Looper;
import c.t.m.g.cp$a;
import android.os.HandlerThread;
import java.lang.Character;
import java.lang.CharSequence;
import java.lang.System;
import android.bluetooth.le.ScanFilter$Builder;
import java.util.Iterator;
import android.content.pm.PackageManager;
import android.os.Message;

public class cp extends ScanCallback	// class@000c1b
{
    public final Context a;
    public BluetoothManager b;
    public BluetoothAdapter c;
    public BluetoothLeScanner d;
    public ScanSettings e;
    public List f;
    public List g;
    public List h;
    public String[] i;
    public boolean j;
    public cp$a k;
    public HandlerThread l;
    public byte[] m;

    public void cp(Context p0){
       super();
       int i = 0;
       byte[] uobyteArray = new byte[i];
       this.m = uobyteArray;
       this.a = p0;
       this.g = new LinkedList();
       this.h = new LinkedList();
       if (ed.a) {
          ed.a("hh", "TxBluetoothProvider fun_d");
       }
       this.i = ("AB8190D5-D11E-4941-ACC4-42F30510B408,FDA50693-A4E2-4FB1-AFCF-C6EB07647825").split(",");
       this.b = p0.getSystemService("bluetooth");
       this.e = new ScanSettings$Builder().setScanMode(1).build();
       this.f = new ArrayList();
       cp ti = this.i;
       int len = ti.length;
       for (; i < len; i = i + 1) {
          this.f.add(this.b(ti[i]));
       }
       return;
    }
    public static BluetoothAdapter a(cp p0,BluetoothAdapter p1){
       p0.c = p1;
       return p1;
    }
    public static BluetoothManager a(cp p0){
       return p0.b;
    }
    public static BluetoothLeScanner a(cp p0,BluetoothLeScanner p1){
       p0.d = p1;
       return p1;
    }
    public static void a(cp p0,ScanResult p1){
       p0.a(p1);
    }
    public static BluetoothAdapter b(cp p0){
       return p0.c;
    }
    public static int c(cp p0){
       return p0.c();
    }
    public static boolean d(cp p0){
       return p0.j;
    }
    public static void e(cp p0){
       p0.d();
    }
    public void a(){
       cp tm = this.m;
       _monitor_enter(tm);
       cp tk = this.k;
       if (tk != null) {
          tk.removeCallbacksAndMessages(null);
          this.k.sendEmptyMessage(0x182ba);
          this.k = null;
       }
       if (this.l != null) {
          this.l = null;
       }
       _monitor_exit(tm);
       return;
    }
    public final void a(ScanResult p0){
       if (p0 == null) {
          return;
       }
       BluetoothDevice device = p0.getDevice();
       int rssi = p0.getRssi();
       byte[] bytes = p0.getScanRecord().getBytes();
       if (bytes != null && bytes.length >= 30) {
          this.a(de.a(device, rssi, bytes));
       }
       return;
    }
    public void a(Handler p0){
       cp tm = this.m;
       _monitor_enter(tm);
       if (ed.a) {
          ed.a("TxBluetoothProvider", "ble provider startup");
       }
       if (this.k == null) {
          if (p0 != null && p0.getLooper() != null) {
             if (ed.a) {
                ed.a("TxBluetoothProvider", "ble handler create on other thread");
             }
             this.k = new cp$a(this, p0.getLooper());
          }else {
             HandlerThread handlerThrea = new HandlerThread("thread-bleloc");
             this.l = handlerThrea;
             handlerThrea.start();
             Looper looper = this.l.getLooper();
             if (ed.a) {
                ed.a("TxBluetoothProvider", "ble handler create on thread-bleloc thread");
             }
             this.k = new cp$a(this, looper);
          }
       }
       this.k.sendEmptyMessage(0x182b9);
       _monitor_exit(tm);
       return;
    }
    public final void a(de p0){
       cp tg = this.g;
       _monitor_enter(tg);
       if (p0 != null) {
          this.g.add(p0);
       }
       _monitor_exit(tg);
       return;
    }
    public final byte[] a(String p0){
       int i = p0.length();
       byte[] uobyteArray = new byte[(i / 2)];
       for (int i1 = 0; i1 < i; i1 = i1 + 2) {
          int i2 = i1 / 2;
          int i3 = Character.digit(p0.charAt(i1), 16) << 4;
          int i4 = i1 + 1;
          i3 = i3 + Character.digit(p0.charAt(i4), 16);
          uobyteArray[i2] = (byte)i3;
       }
       return uobyteArray;
    }
    public final ScanFilter b(String p0){
       byte[] uobyteArray = new byte[23]{0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00};
       System.arraycopy(this.a(p0.replace("-", "")), 0, uobyteArray, 2, 16);
       return new ScanFilter$Builder().setManufacturerData(76, uobyteArray, new byte[23]{0x00,0x00,0x01,0x01,0x01,0x01,0x01,0x01,0x01,0x01,0x01,0x01,0x01,0x01,0x01,0x01,0x01,0x01,0x00,0x00,0x00,0x00,0x00}).build();
    }
    public List b(){
       cp tg = this.g;
       _monitor_enter(tg);
       Iterator iterator = this.g.iterator();
       this.h.clear();
       while (iterator.hasNext()) {
          de uode = iterator.next();
          long l = System.currentTimeMillis() - uode.e();
          if (l - 5000 <= 0) {
             this.h.add(uode.clone());
          }
       }
       this.g.clear();
       _monitor_exit(tg);
       return this.h;
    }
    public final int c(){
       if (!this.a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
          return -1;
       }
       cp tc = this.c;
       if (tc != null && tc.isEnabled()) {
          tc = this.d;
          if (tc != null) {
             tc.startScan(this.f, this.e, this);
             this.j = true;
             return 0;
          }
       }
       return -2;
    }
    public final void d(){
       cp tm = this.m;
       _monitor_enter(tm);
       if (!this.a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
          _monitor_exit(tm);
          return;
       }else {
          cp td = this.d;
          if (td != null) {
             td.stopScan(this);
          }
          this.c = null;
          _monitor_exit(tm);
          this.j = false;
          tm = this.g;
          _monitor_enter(tm);
          this.g.clear();
          _monitor_exit(tm);
          return;
       }
    }
    public void onBatchScanResults(List p0){
    }
    public void onScanFailed(int p0){
    }
    public void onScanResult(int p0,ScanResult p1){
       cp tk = this.k;
       if (tk != null) {
          Message message = tk.obtainMessage();
          message.what = 0x182bb;
          message.obj = p1;
          tk.sendMessage(message);
       }
       return;
    }
}
