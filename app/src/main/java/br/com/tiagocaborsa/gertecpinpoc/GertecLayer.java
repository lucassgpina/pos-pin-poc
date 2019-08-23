package br.com.tiagocaborsa.gertecpinpoc;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;

import java.util.Map;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class GertecLayer {

    private static final String TAG = GertecLayer.class.getName();
    private Context context;
    private Class gertecPinActivityClass;
    private GertecPinHelper gertecPinHelper;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnCancel;
    private Button btnClear;
    private Button btnConfirm;

    GertecLayer(Map<String, Object> properties) {
        context = (Context) properties.get(Constants.ANDROID_CONTEXT);
        gertecPinActivityClass =
                (Class) properties.get(Constants.GERTEC_PIN_ACTIVIY_CLASS);
        gertecPinHelper = (GertecPinHelper) properties.get(Constants.GERTEC_PIN_HELPER);
    }


    public void openPed() {
        Intent intent = new Intent(context, gertecPinActivityClass);
        intent.addFlags(FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    public boolean validateReferences() {
        return gertecPinHelper.gertecPinKeyboard.getPedActivity() != null;
    }
}