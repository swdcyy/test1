package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.utils.TextTemplateConstantV2$DEFAULT_SK2C_PARAMS$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;

public final class TextTemplateConstantV2$DEFAULT_SK2C_PARAMS$2 extends Lambda implements a	// class@000bbc
{
    public static final TextTemplateConstantV2$DEFAULT_SK2C_PARAMS$2 INSTANCE;

    static {
       TextTemplateConstantV2$DEFAULT_SK2C_PARAMS$2.INSTANCE = new TextTemplateConstantV2$DEFAULT_SK2C_PARAMS$2();
    }
    public void TextTemplateConstantV2$DEFAULT_SK2C_PARAMS$2(){
       super(0);
    }
    public final DynamicTextParams invoke(){
       Object obj = PatchProxy.apply(null, this, TextTemplateConstantV2$DEFAULT_SK2C_PARAMS$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Gson().h("{ \"minWidth\": 0, \"maxTextLength\": 120, \"background\": { \"enable\": false, \"fileList\": [] }, \"hint\": { \"enable\": true, \"hintType\": 1 }, \"textPadding\": { \"left\": 7, \"top\": 7, \"right\": 7, \"bottom\": 7 }, \"maxWidth\": 0, \"maxHeight\": 4999.5, \"absLineSpace\": 11, \"cursorColor\": { \"alpha\": 1, \"red\": 0, \"green\": 0, \"blue\": 0 }, \"text\": { \"defaultTextSize\": 0, \"textAlign\": 1, \"topCount\": 0, \"repeatCount\": 1, \"topLayers\": [], \"repeatLayers\": [ { \"layers\": [ { \"offset\": { \"x\": 0, \"y\": 0 }, \"layerType\": 0, \"fill\": { \"fillType\": 0, \"color\": { \"alpha\": 1, \"red\": 1, \"green\": 1, \"blue\": 1 } }, \"shadow\": { \"dx\": 0, \"dy\": 0.75, \"blur\": 1, \"color\": { \"alpha\": 0.4, \"red\": 0, \"green\": 0, \"blue\": 0 } } } ] } ] }, \"styleable\": { \"enable\": true, \"enableChangeAlign\": true, \"defaultMode\": 3, \"attrs\": { \"enableBackground\": false, \"strokeList\": [], \"fillList\": [], \"shadowList\": [ 0 ] } } }", DynamicTextParams.class);
    }
    public Object invoke(){
       return this.invoke();
    }
}
