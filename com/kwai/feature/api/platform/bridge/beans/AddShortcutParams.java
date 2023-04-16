package com.kwai.feature.api.platform.bridge.beans.AddShortcutParams;
import java.io.Serializable;
import java.lang.Object;

public class AddShortcutParams implements Serializable	// class@00103e
{
    public String icon;
    public String name;
    public String shortcutId;
    public boolean updateIfExist;
    public String uri;

    public void AddShortcutParams(){
       super();
    }
}
