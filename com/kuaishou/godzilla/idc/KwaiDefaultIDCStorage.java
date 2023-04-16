package com.kuaishou.godzilla.idc.KwaiDefaultIDCStorage;
import com.kuaishou.godzilla.idc.KwaiIDCStorage;
import android.content.SharedPreferences;
import com.kuaishou.godzilla.idc.KwaiDefaultIDCStorage$DefaultHostsReader;
import java.lang.String;
import java.lang.Object;
import com.google.gson.Gson;
import com.kuaishou.godzilla.idc.KwaiDefaultIDCStorage$1;
import java.lang.reflect.Type;
import el.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import com.kuaishou.godzilla.idc.KwaiIDCUtils;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collection;
import java.lang.Iterable;
import java.util.HashSet;
import com.google.common.collect.o;
import com.kuaishou.godzilla.Godzilla;
import android.util.Pair;
import java.util.HashMap;
import java.lang.Number;
import java.lang.Integer;

public class KwaiDefaultIDCStorage implements KwaiIDCStorage	// class@000897
{
    public List mAllTypes;
    public List mDefaultHosts;
    public Gson mGson;
    public Type mHostListType;
    public SharedPreferences mPreference;
    public KwaiDefaultIDCStorage$DefaultHostsReader mReader;
    public String mTag;

    public void KwaiDefaultIDCStorage(SharedPreferences p0,KwaiDefaultIDCStorage$DefaultHostsReader p1,String p2){
       super();
       this.mTag = "idc";
       this.mGson = new Gson();
       this.mHostListType = new KwaiDefaultIDCStorage$1(this).getType();
       this.mReader = p1;
       this.mPreference = p0;
       if (!TextUtils.isEmpty(p2)) {
          this.mTag = p2;
       }
       return;
    }
    public final void cleanStoredHosts(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiDefaultIDCStorage.class, "14")) {
          return;
       }
       if (this.mPreference == null) {
          return;
       }
       g.a(this.mPreference.edit().remove(this.getHostKey(p0)));
       return;
    }
    public final String getDefaultHostKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiDefaultIDCStorage.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mTag+"_default_"+p0;
    }
    public final String getHostKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiDefaultIDCStorage.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mTag+"_"+p0;
    }
    public final String getPostionKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiDefaultIDCStorage.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getHostKey(p0)+"_pos";
    }
    public final String getTypesKey(){
       Object obj = PatchProxy.apply(null, this, KwaiDefaultIDCStorage.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mTag+"_types";
    }
    public List readDefaultHosts(){
       ArrayList obj = PatchProxy.apply(null, this, KwaiDefaultIDCStorage.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mDefaultHosts == null) {
          obj = new ArrayList();
          Map map = this.readDefaultHostsInside();
          Map map1 = this.readDefaultHostsOutside();
          if (!KwaiIDCUtils.isMapEmpty(map1)) {
             Iterator iterator = map1.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                StringBuilder str = 1;
                List mapItem = KwaiIDCUtils.getMapItem(map, uEntry.getKey());
                if (!KwaiIDCUtils.isCollectionEmpty(mapItem) && o.i(mapItem).equals(o.i(uEntry.getValue()))) {
                   str = null;
                }
                if (str) {
                   Godzilla.logd("Godzilla:IDC:", "default hosts changed for type "+uEntry.getKey());
                   this.cleanStoredHosts(uEntry.getKey());
                   this.storeDefaultHosts(uEntry.getKey(), uEntry.getValue());
                }
                obj.add(new Pair(uEntry.getKey(), uEntry.getValue()));
             }
          }
          this.mDefaultHosts = obj;
       }
       return this.mDefaultHosts;
    }
    public final Map readDefaultHostsInside(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, KwaiDefaultIDCStorage.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.readHostTypes();
       if (KwaiIDCUtils.isCollectionEmpty(obj)) {
          return objArray;
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          List list = this.readHostsData(this.getDefaultHostKey(str));
          if (!KwaiIDCUtils.isCollectionEmpty(list)) {
             hashMap.put(str, list);
          }
       }
       return hashMap;
    }
    public final Map readDefaultHostsOutside(){
       KwaiDefaultIDCStorage obj = PatchProxy.apply(null, this, KwaiDefaultIDCStorage.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mReader;
       if (obj == null) {
          return null;
       }
       return obj.readDefaultHosts();
    }
    public List readHostTypes(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, KwaiDefaultIDCStorage.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mPreference != null) {
          obj = new ArrayList();
          Set stringSet = this.mPreference.getStringSet(this.getTypesKey(), objArray);
          if (stringSet != null) {
             Iterator iterator = stringSet.iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                if (!TextUtils.isEmpty(str)) {
                   obj.add(str);
                }
             }
          }
          objArray = obj;
       }
       return objArray;
    }
    public List readHosts(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiDefaultIDCStorage.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.readHostsData(this.getHostKey(p0));
    }
    public List readHostsBatch(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, KwaiDefaultIDCStorage.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj.add(this.readHosts(iterator.next()));
       }
       return obj;
    }
    public final List readHostsData(String p0){
       KwaiDefaultIDCStorage obj = PatchProxy.applyOneRefs(p0, this, KwaiDefaultIDCStorage.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPreference;
       List list = null;
       if (obj == null) {
          return list;
       }
       String str = obj.getString(p0, "");
       if (TextUtils.isEmpty(str)) {
          return list;
       }
       try{
          list = this.mGson.i(str, this.mHostListType);
          Godzilla.logd("Godzilla:IDC:", "read "+p0+" hosts: "+list);
          return list;
       }catch(java.lang.Exception e0){
       }
    }
    public int readPosition(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiDefaultIDCStorage.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (this.mPreference != null) {
          i = this.mPreference.getInt(this.getPostionKey(p0), i);
       }
       Godzilla.logd("Godzilla:IDC:", "read position type "+p0+", pos "+i);
       return i;
    }
    public int[] readPositionBatch(List p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, KwaiDefaultIDCStorage.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[p0.size()];
       for (int i = 0; i < p0.size(); i = i + 1) {
          obj[i] = this.readPosition(p0.get(i));
       }
       return obj;
    }
    public final void storeDefaultHosts(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiDefaultIDCStorage.class, "15")) {
          return;
       }
       this.storeHostsData(this.getDefaultHostKey(p0), p1);
       return;
    }
    public void storeHostTypes(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiDefaultIDCStorage.class, "3")) {
          return;
       }
       if (this.mPreference != null && (p0 != null && p0.size() > 0)) {
          g.a(this.mPreference.edit().putStringSet(this.getTypesKey(), new HashSet(p0)));
       }
    label_002d :
       return;
    }
    public void storeHosts(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiDefaultIDCStorage.class, "1")) {
          return;
       }
       this.storeHostsData(this.getHostKey(p0), p1);
       return;
    }
    public final void storeHostsData(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiDefaultIDCStorage.class, "10")) {
          return;
       }
       if (this.mPreference == null || (!TextUtils.isEmpty(p0) && !KwaiIDCUtils.isCollectionEmpty(p1))) {
          String str = this.mGson.q(p1);
          if (!TextUtils.isEmpty(str)) {
             g.a(this.mPreference.edit().putString(p0, str));
             Godzilla.logd("Godzilla:IDC:", "store "+p0+" hosts: "+str);
          }
       }
       return;
    }
    public void storePosition(String p0,int p1){
       KwaiDefaultIDCStorage kwaiDefaultI = KwaiDefaultIDCStorage.class;
       if (PatchProxy.isSupport(kwaiDefaultI) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, kwaiDefaultI, "2")) {
          return;
       }
       Godzilla.logd("Godzilla:IDC:", "store type "+p0+" for pos "+p1);
       if (this.mPreference != null && !TextUtils.isEmpty(p0)) {
          g.a(this.mPreference.edit().putInt(this.getPostionKey(p0), p1));
       }
       return;
    }
}
