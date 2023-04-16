package com.kuaishou.android.security.bridge.main.a;
import com.kuaishou.android.security.internal.common.g;
import com.kuaishou.android.security.internal.dispatch.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import java.util.Map;
import java.lang.Exception;
import com.kuaishou.android.security.internal.common.h;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import com.kuaishou.android.security.base.exception.KSException;
import com.kuaishou.android.security.base.perf.c;
import com.kuaishou.android.security.base.perf.j;
import com.kuaishou.android.security.base.perf.k;
import com.kuaishou.android.security.internal.crypto.f;
import com.kuaishou.android.security.base.perf.a$a;
import java.lang.System;
import com.kuaishou.android.security.base.util.KSecurityTrack;
import com.kuaishou.android.security.base.perf.d$b;
import com.kuaishou.android.security.base.perf.d;
import com.kuaishou.android.security.internal.crypto.e;
import java.lang.Throwable;
import com.kuaishou.android.security.KSecurity$ENV;
import com.kuaishou.android.security.bridge.main.a$a;
import java.lang.Enum;
import com.kuaishou.android.security.internal.crypto.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.security.internal.common.b;
import com.kuaishou.android.security.internal.crypto.b;
import com.kuaishou.android.security.internal.crypto.c;
import com.kuaishou.android.security.KSecurity;
import com.kuaishou.android.security.base.util.c;
import android.content.Context;

public abstract class a extends b implements g	// class@0006bb
{

    public void a(){
       super();
    }
    public String a(int p0,boolean p1,String p2){
       Object[] obj;
       String str = "disable_0x515C_and";
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, a.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          if (b.i().h() != null && (b.i().h().getKeyconfigMap() != null && (b.i().h().getKeyconfigMap().get(str) != null && b.i().h().getKeyconfigMap().get(str).booleanValue()))) {
             return "";
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
    label_006c :
       if (!this.g()) {
          if (b.i().j() != null) {
             obj = new Object[]{Boolean.valueOf(p1),c.a()};
             b.i().j().e().onSeucrityError(new KSException(String.format("[KGE]KWSecurity[%b] getSecurityValue dont Init [%s]", obj), 0x2714));
          }
          throw new KSException(0x2714);
       }else {
          k.a(a$a.k, k.a());
          return this.e().a(p0, p1, p2);
       }
    }
    public String a(String p0,boolean p1,String p2){
       String str = "disable_0xD49B_and";
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, a.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          if (b.i().h() != null && (b.i().h().getKeyconfigMap() != null && (b.i().h().getKeyconfigMap().get(str) != null && b.i().h().getKeyconfigMap().get(str).booleanValue()))) {
             return "";
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
    label_0069 :
       long l = System.currentTimeMillis();
       if (!this.g()) {
          KSecurityTrack.sLog(99, l);
          KSecurityTrack.sLog(-99);
          Object[] objArray = new Object[]{Boolean.valueOf(p1),Boolean.valueOf(b.i().m()),c.a()};
          objArray = String.format("[KGE]KWSecurity[%b] atlassignPlus dont Init [isloadding:{%s}][%s]", objArray);
          KSException kSException = new KSException(objArray, 0x2714);
          if (b.i().j() != null) {
             b.i().j().e().onSeucrityError(kSException);
          }
          d.a(d$b.a, objArray, 0x2714);
          throw kSException;
       }else if(!p0.length()){
          Object[] objArray1 = new Object[]{c.a()};
          b.i().j().e().onSeucrityError(new KSException(String.format("[KGE]KWSecurity atlasSignPlus invalid parameter [%s]", objArray1), 0x2b62));
          return "";
       }else {
          return this.d().c(p0, p1, p2);
       }
    }
    public String a(boolean p0,String p1,String p2){
       String str = "disable_0x7405_and";
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, p2, this, a.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          if (b.i().h() != null && (b.i().h().getKeyconfigMap() != null && (b.i().h().getKeyconfigMap().get(str) != null && b.i().h().getKeyconfigMap().get(str).booleanValue()))) {
             return "";
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
    label_0069 :
       long l = System.currentTimeMillis();
       if (!this.g()) {
          KSecurityTrack.sLog(99, l);
          KSecurityTrack.sLog(-99);
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Boolean.valueOf(b.i().m()),c.a()};
          String str1 = String.format("[KGE]KWSecurity[%b] local challenge dont Init [isloadding:{%s}][%s]", objArray);
          KSException kSException = new KSException(str1, 0x2714);
          if (b.i().j() != null) {
             b.i().j().e().onSeucrityError(kSException);
          }
          d.a(d$b.a, str1, 0x2714);
          throw kSException;
       }else {
          return this.d().a(p0, p1, p2);
       }
    }
    public boolean a(KSecurity$ENV p0,boolean p1,String p2){
       String str2;
       String str = "disable_0x758E_and";
       if (PatchProxy.isSupport(a.class)) {
          p2 = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, a.class, "5");
          if (p2 != PatchProxyResult.class) {
             return p2.booleanValue();
          }
       }
       boolean b = false;
       try{
          if (b.i().h() != null && (b.i().h().getKeyconfigMap() != null && (b.i().h().getKeyconfigMap().get(str) != null && b.i().h().getKeyconfigMap().get(str).booleanValue()))) {
             return b;
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
    label_006c :
       int i = 1;
       if (!this.g()) {
          if (b.i().j() != null) {
             Object[] objArray = new Object[]{Boolean.valueOf(p1),c.a()};
             b.i().j().e().onSeucrityError(new KSException(String.format("[KGE]KWSecurity[%b] detectEnvironment dont Init [%s]", objArray), 0x2714));
          }
          return b;
       }else {
          String str1 = "1:0:0:0:0:0:0";
          str = "0:1:0:0:0:0:0";
          switch (a$a.a[p0.ordinal()]){
              case 1:
                str2 = this.c().a(str1);
                if (str2 != null && (!TextUtils.isEmpty(str2) && str2.equals(str1))) {
                   return i;
                }
                break;
              case 2:
                str2 = this.c().a(str);
                if (str2 != null && (!TextUtils.isEmpty(str2) && str2.equals(str))) {
                   return i;
                }
                break;
              case 3:
                str2 = this.c().a("0:0:1:0:0:0:0");
                if (str2 != null && (!TextUtils.isEmpty(str2) && str2.equals("0:0:1:0:0:0:0"))) {
                   return i;
                }
                break;
              case 4:
                str2 = this.c().a("0:0:0:1:0:0:0");
                if (str2 != null && (!TextUtils.isEmpty(str2) && str2.equals("0:0:0:1:0:0:0"))) {
                   return i;
                }
                break;
              case 5:
                str2 = this.c().a("0:0:0:0:1:0:0");
                if (str2 != null && (!TextUtils.isEmpty(str2) && str2.equals("0:0:0:0:1:0:0"))) {
                   return i;
                }
                break;
              case 6:
                str2 = this.c().a("0:0:0:0:0:0:1");
                if (str2 != null && (!TextUtils.isEmpty(str2) && str2.equals("0:0:0:0:0:0:1"))) {
                   return i;
                }
                break;
              default:
          }
       label_014c :
          return b;
       }
    }
    public byte[] a(byte[] p0,b p1,boolean p2,boolean p3,String p4){
       String str = "disable_0x04F6_and";
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4};
          p4 = PatchProxy.apply(objArray, this, uoa, "13");
          if (p4 != PatchProxyResult.class) {
             return p4;
          }
       }
       try{
          if (b.i().h() != null && (b.i().h().getKeyconfigMap() != null && (b.i().h().getKeyconfigMap().get(str) != null && b.i().h().getKeyconfigMap().get(str).booleanValue()))) {
             p0 = new byte[0];
             return p0;
          }
       }catch(java.lang.Exception e13){
          e13.printStackTrace();
       }
    label_007a :
       if (!this.g()) {
          if (b.i().j() != null) {
             Object[] objArray1 = new Object[]{Boolean.valueOf(p3),c.a()};
             b.i().j().e().onSeucrityError(new KSException(String.format("[KGE]KWSecurity[%b] asymmetricDecrypt dont Init [%s]", objArray1), 0x2714));
          }
          throw new KSException(0x2714);
       }else {
          k.a(a$a.j, k.a());
          return this.a().a(p0, p1, p2, p3);
       }
    }
    public byte[] a(byte[] p0,boolean p1,String p2){
       String str = "disable_0x4A9F_and";
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       try{
          if (b.i().h() != null && (b.i().h().getKeyconfigMap() != null && (b.i().h().getKeyconfigMap().get(str) != null && b.i().h().getKeyconfigMap().get(str).booleanValue()))) {
             p0 = new byte[i];
             return p0;
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
    label_006a :
       int i1 = 1;
       if (!this.g()) {
          if (b.i().j() != null) {
             Object[] objArray = new Object[i1];
             objArray[i] = c.a();
             b.i().j().e().onSeucrityError(new KSException(String.format("[KGE]KWSecurity atlasEncrypt dont Init [%s]", objArray), 0x2714));
          }
          throw new KSException(0x2714);
       }else {
          k.a(a$a.e, k.a());
          return this.b().b(p0, i1, p1, p2);
       }
    }
    public byte[] a(byte[] p0,boolean p1,boolean p2,String p3){
       String str = "disable_0xE17F_and";
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, a.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       try{
          if (b.i().h() != null && (b.i().h().getKeyconfigMap() != null && (b.i().h().getKeyconfigMap().get(str) != null && b.i().h().getKeyconfigMap().get(str).booleanValue()))) {
             p0 = new byte[i];
             return p0;
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
    label_006e :
       if (!this.g()) {
          if (b.i().j() != null) {
             Object[] objArray = new Object[]{Boolean.valueOf(p2),c.a()};
             b.i().j().e().onSeucrityError(new KSException(String.format("[KGE]KWSecurity[%b] uDecrypt dont Init [%s]", objArray), 0x2714));
          }
          throw new KSException(0x2714);
       }else {
          k.a(a$a.h, k.a());
          return this.b().c(p0, p1, p2, p3);
       }
    }
    public String b(String p0,boolean p1,String p2){
       String str = "disable_0x38B7_and";
       if (PatchProxy.isSupport(a.class)) {
          p2 = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, a.class, "11");
          if (p2 != PatchProxyResult.class) {
             return p2;
          }
       }
       try{
          if (b.i().h() != null && (b.i().h().getKeyconfigMap() != null && (b.i().h().getKeyconfigMap().get(str) != null && b.i().h().getKeyconfigMap().get(str).booleanValue()))) {
             return "0:0:0:0:0:0";
          }
       }catch(java.lang.Exception e11){
          e11.printStackTrace();
       }
    label_0069 :
       if (!KSecurity.isInitialize() && b.i().j() != null) {
          Object[] objArray = new Object[]{Boolean.valueOf(p1),c.a()};
          b.i().j().e().onSeucrityError(new KSException(String.format("[KGE]KWSecurity[%b] CheckEnv dont Init [%s]", objArray), 0x2714));
       }
       k.a(a$a.l, k.a());
       return this.c().a(p0);
    }
    public byte[] b(byte[] p0,b p1,boolean p2,boolean p3,String p4){
       String str = "disable_0x7F35_and";
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4};
          p4 = PatchProxy.apply(objArray, this, uoa, "12");
          if (p4 != PatchProxyResult.class) {
             return p4;
          }
       }
       try{
          if (b.i().h() != null && (b.i().h().getKeyconfigMap() != null && (b.i().h().getKeyconfigMap().get(str) != null && b.i().h().getKeyconfigMap().get(str).booleanValue()))) {
             p0 = new byte[0];
             return p0;
          }
       }catch(java.lang.Exception e13){
          e13.printStackTrace();
       }
    label_007a :
       if (!this.g()) {
          if (b.i().j() != null) {
             Object[] objArray1 = new Object[]{Boolean.valueOf(p3),c.a()};
             b.i().j().e().onSeucrityError(new KSException(String.format("[KGE]KWSecurity[%b] asymmetricEncrypt dont Init [%s]", objArray1), 0x2714));
          }
          throw new KSException(0x2714);
       }else {
          k.a(a$a.i, k.a());
          return this.a().b(p0, p1, p2, p3);
       }
    }
    public byte[] b(byte[] p0,boolean p1,String p2){
       String str = "disable_0x315C_and";
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       try{
          if (b.i().h() != null && (b.i().h().getKeyconfigMap() != null && (b.i().h().getKeyconfigMap().get(str) != null && b.i().h().getKeyconfigMap().get(str).booleanValue()))) {
             p0 = new byte[i];
             return p0;
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
    label_006a :
       if (this.g() || b.i().j() == null) {
          k.a(a$a.f, k.a());
          return this.b().a(p0, i, p1, p2);
       }else {
          Object[] objArray = new Object[]{Boolean.valueOf(p1),c.a()};
          b.i().j().e().onSeucrityError(new KSException(String.format("[KGE]KWSecurity[%b] atlasDecrypt not Init [%s] ", objArray), 0x2714));
          throw new KSException(0x2714);
       }
    }
    public byte[] b(byte[] p0,boolean p1,boolean p2,String p3){
       String str = "disable_0x9ABC_and";
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       try{
          if (b.i().h() != null && (b.i().h().getKeyconfigMap() != null && (b.i().h().getKeyconfigMap().get(str) != null && b.i().h().getKeyconfigMap().get(str).booleanValue()))) {
             p0 = new byte[i];
             return p0;
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
    label_006e :
       if (!this.g()) {
          if (b.i().j() != null) {
             Object[] objArray = new Object[]{Boolean.valueOf(p2),c.a()};
             b.i().j().e().onSeucrityError(new KSException(String.format("[KGE]KWSecurity[%b] uEncrypt dont Init [%s]", objArray), 0x2714));
          }
          throw new KSException(0x2714);
       }else {
          k.a(a$a.g, k.a());
          return this.b().d(p0, p1, p2, p3);
       }
    }
    public String c(String p0,boolean p1,String p2){
       String str = "disable_0x5845_and";
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, a.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          if (b.i().h() != null && (b.i().h().getKeyconfigMap() != null && (b.i().h().getKeyconfigMap().get(str) != null && b.i().h().getKeyconfigMap().get(str).booleanValue()))) {
             return "";
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
    label_0069 :
       long l = System.currentTimeMillis();
       if (!this.g()) {
          KSecurityTrack.sLog(99, l);
          KSecurityTrack.sLog(-99);
          Object[] objArray = new Object[]{Boolean.valueOf(p1),Boolean.valueOf(b.i().m()),c.a()};
          objArray = String.format("[KGE]KWSecurity[%b] challenge dont Init [isloadding:{%s}][%s]", objArray);
          KSException kSException = new KSException(objArray, 0x2714);
          if (b.i().j() != null) {
             b.i().j().e().onSeucrityError(kSException);
          }
          d.a(d$b.a, objArray, 0x2714);
          throw kSException;
       }else if(!p0.length()){
          Object[] objArray1 = new Object[]{c.a()};
          b.i().j().e().onSeucrityError(new KSException(String.format("[KGE]KWSecurity challenge invalid parameter [%s]", objArray1), 0x2715));
          return "";
       }else {
          p0 = this.d().a(p0, p1, p2);
          if (p0 == null || p0.isEmpty()) {
             d.a(d$b.a, "challenge ret empty or null", 0x2714);
             return "";
          }else {
             return p0;
          }
       }
    }
    public String d(String p0,boolean p1,String p2){
       String str = "disable_0x4840_and";
       String str1 = "";
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, a.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          if (b.i().h() != null && (b.i().h().getKeyconfigMap() != null && (b.i().h().getKeyconfigMap().get(str) != null && b.i().h().getKeyconfigMap().get(str).booleanValue()))) {
             return str1;
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
    label_0069 :
       long l = System.currentTimeMillis();
       if (!this.g()) {
          KSecurityTrack.sLog(99, l);
          KSecurityTrack.sLog(-99);
          Object[] objArray = new Object[]{Boolean.valueOf(p1),Boolean.valueOf(b.i().m()),c.a()};
          objArray = String.format("[KGE]KWSecurity[%b] atlassign dont Init [isloadding:{%s}][%s]", objArray);
          KSException kSException = new KSException(objArray, 0x2714);
          if (b.i().j() != null) {
             b.i().j().e().onSeucrityError(kSException);
          }
          d.a(d$b.a, objArray, 0x2714);
          throw kSException;
       }else if(!p0.length()){
          Object[] objArray1 = new Object[]{c.a()};
          b.i().j().e().onSeucrityError(new KSException(String.format("[KGE]KWSecurity atlasSign invalid parameter [%s]", objArray1), 0x2715));
          return str1;
       }else if(new c(b.i().j().c()).m()){
          return this.d().b(p0, p1, p2);
       }else {
          return this.d().c(p0, p1, p2);
       }
    }
    public abstract boolean g();
}
