package com.xiaomi.shop2.base;

import android.view.View;

/**
 * Created by bluerain on 17-1-14.
 */

public interface ICardItem {

    View draw(Object data);

    void bind(View view, Object data);

}
