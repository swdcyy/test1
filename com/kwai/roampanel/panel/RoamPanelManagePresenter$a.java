package com.kwai.roampanel.panel.RoamPanelManagePresenter$a;
import com.kwai.feature.api.social.nearby.model.roampanel.RoamPanelAction;
import java.lang.Enum;

public class RoamPanelManagePresenter$a	// class@0013d6
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RoamPanelAction.values().length];
       try{
          RoamPanelManagePresenter$a.a = ointArray;
          ointArray[RoamPanelAction.SMOOTH_EXPAND.ordinal()] = 1;
          try{
             RoamPanelManagePresenter$a.a[RoamPanelAction.SMOOTH_COLLAPSE.ordinal()] = 2;
             try{
                RoamPanelManagePresenter$a.a[RoamPanelAction.IMMEDIATE_COLLAPSE.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
