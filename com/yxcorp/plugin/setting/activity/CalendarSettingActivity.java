package com.yxcorp.plugin.setting.activity.CalendarSettingActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import com.yxcorp.plugin.setting.fragment.CalendarSettingListFragment;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.KwaiDialogFragment;
import wgd.a;
import brd.t;
import wgd.c;
import com.yxcorp.plugin.setting.stencil.config.SettingPage;
import cjd.e;
import erd.o;
import zfd.i;
import com.yxcorp.plugin.setting.activity.c;
import erd.g;
import crd.b;
import ygd.a;
import com.yxcorp.plugin.setting.stencil.entity.CalendarSettingConfig;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.plugin.setting.stencil.entity.CalendarSettingGroup;
import com.yxcorp.plugin.setting.stencil.entity.CalendarSettingItem;
import com.yxcorp.plugin.setting.stencil.entity.CalendarSettingItemInfo;
import com.yxcorp.gifshow.model.SwitchItem;
import com.yxcorp.gifshow.settings.stencil.entity.SettingLocalizedString;
import com.yxcorp.plugin.setting.stencil.entity.CalendarSettingSelectedOption;
import com.yxcorp.gifshow.model.SelectOption;
import qrd.l1;
import yfd.d;
import java.util.Collection;
import ekd.q;
import com.yxcorp.plugin.setting.entries.holder.b;

public class CalendarSettingActivity extends GifshowActivity	// class@000800
{
    public ProgressFragment A;
    public CalendarSettingListFragment y;
    public CalendarSettingConfig z;
    public static final int B;

    public void CalendarSettingActivity(){
       super();
    }
    public int getPage(){
       CalendarSettingActivity obj = PatchProxy.apply(null, this, CalendarSettingActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int i = (obj != null)? obj.f(): 0;
       return i;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CalendarSettingActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "kwai://setting/calendar";
    }
    public void onCreate(Bundle p0){
       CalendarSettingActivity uCalendarSet = CalendarSettingActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uCalendarSet, "1")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       int i = 0x7f100479;
       if (!PatchProxy.applyVoid(null, this, uCalendarSet, "2")) {
          CalendarSettingListFragment uCalendarSet1 = new CalendarSettingListFragment();
          this.y = uCalendarSet1;
          uCalendarSet1.dh(new ArrayList()).eh(i);
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.v(0x1020002, this.y);
          uoe.m();
       }
       ProgressFragment progressFrag = new ProgressFragment();
       this.A = progressFrag;
       progressFrag.Ih(i);
       this.A.show(this.getSupportFragmentManager(), "loading");
       this.u3();
       return;
    }
    public final void u3(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CalendarSettingActivity.class, "5")) {
          return;
       }
       t ot = PatchProxy.apply(objArray, objArray, a.class, "3");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = a.a().b(SettingPage.CALENDAR_SETTING.getPageKey());
       }
       ot.map(new e()).subscribe(new i(this), new c(this));
       return;
    }
    public final void v3(){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CalendarSettingActivity.class, "3")) {
          return;
       }
       CalendarSettingActivity tz = this.z;
       ArrayList uArrayList = PatchProxy.applyOneRefs(tz, objArray, a.class, "1");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          if (tz != null) {
             List groups = tz.getGroups();
             if (groups != null) {
                Iterator iterator1 = groups.iterator();
                while (iterator1.hasNext()) {
                   List items = iterator1.next().getItems();
                   if (items != null) {
                      Iterator iterator2 = items.iterator();
                      while (iterator2.hasNext()) {
                         CalendarSettingItemInfo itemTypeInfo = iterator2.next().getItemTypeInfo();
                         if (itemTypeInfo != null) {
                            SwitchItem switchItem1 = new SwitchItem();
                            SettingLocalizedString name = itemTypeInfo.getName();
                            String str = "";
                            if (name != null) {
                               str1 = name.getString();
                               if (str1 != null) {
                               label_006c :
                                  switchItem1.mName = str1;
                                  switchItem1.mId = (long)itemTypeInfo.getId();
                                  switchItem1.mGroupId = itemTypeInfo.getGroupId();
                                  name = itemTypeInfo.getDescription();
                                  if (name != null) {
                                     str1 = name.getString();
                                     if (str1 != null) {
                                     label_0089 :
                                        switchItem1.mDescription = str1;
                                        name = itemTypeInfo.getInnerDescription();
                                        if (name != null) {
                                           str1 = name.getString();
                                           if (str1 != null) {
                                           label_0099 :
                                              switchItem1.mInnerInnerDescription = str1;
                                              name = itemTypeInfo.getTitle();
                                              if (name != null) {
                                                 str1 = name.getString();
                                                 if (str1 != null) {
                                                 label_00a9 :
                                                    switchItem1.mTitle = str1;
                                                    CalendarSettingSelectedOption selectedOpti = itemTypeInfo.getSelectedOption();
                                                    if (selectedOpti != null) {
                                                       SelectOption selectOption = new SelectOption();
                                                       SettingLocalizedString name1 = selectedOpti.getName();
                                                       if (name1 != null) {
                                                          String str2 = name1.getString();
                                                          if (str2 != null) {
                                                             str = str2;
                                                          }
                                                       }
                                                       selectOption.mName = str;
                                                       selectOption.mValue = selectedOpti.getValue();
                                                       selectOption.mType = selectedOpti.getType();
                                                       switchItem1.mSelectedOption = selectOption;
                                                    }
                                                    uArrayList.add(switchItem1);
                                                 }
                                              }
                                              str1 = str;
                                              goto label_00a9 ;
                                           }
                                        }
                                        str1 = str;
                                        goto label_0099 ;
                                     }
                                  }
                                  str1 = str;
                                  goto label_0089 ;
                               }
                            }
                            str1 = str;
                            goto label_006c ;
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
          }
       }
       CalendarSettingListFragment uCalendarSet = PatchProxy.applyTwoRefs(this, uArrayList, objArray, d.class, "6");
       if (uCalendarSet != patchProxyRe) {
       }else {
          uCalendarSet = new CalendarSettingListFragment();
          ArrayList uArrayList1 = new ArrayList();
          if (!q.f(uArrayList)) {
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                SwitchItem switchItem = iterator.next();
                if (switchItem != null && ("binary").equals(switchItem.mSelectedOption.mType)) {
                   uArrayList1.add(new b(this, switchItem));
                }
             }
          }
          uCalendarSet.dh(uArrayList1);
          uCalendarSet.eh(R.string.arg_RES_7f100479);
       }
       this.y = uCalendarSet;
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.v(0x1020002, this.y);
       uoe.m();
       return;
    }
}
