package com.kwai.video.clipkit.config.ClipKitConfig;
import java.lang.Object;
import com.kwai.video.clipkit.config.ClipKitConfig$Config;
import com.kwai.video.clipkit.config.EditorEncodeConfig;
import com.kwai.video.devicepersona.hardware.HardwareConfigs;
import com.kwai.video.clipkit.config.EditorImageConfig;
import com.kwai.video.clipkit.config.LowDeviceConfig;
import com.kwai.video.clipkit.config.EditorPreviewConfig;

public class ClipKitConfig	// class@001a5d
{
    public ClipKitConfig$Config config;

    public void ClipKitConfig(){
       super();
       this.config = new ClipKitConfig$Config();
    }
    public EditorEncodeConfig getEditorEncodeConfig(){
       return this.config.editorEncodeConfig;
    }
    public HardwareConfigs getHardwareConfigs(){
       return this.config.hardwareConfigs;
    }
    public EditorImageConfig getImageConfig(){
       return this.config.editorImageConfig;
    }
    public LowDeviceConfig getLowDeviceConfig(){
       return this.config.lowDeviceConfig;
    }
    public EditorPreviewConfig getPreviewConfig(){
       return this.config.editorPreviewConfig;
    }
}
