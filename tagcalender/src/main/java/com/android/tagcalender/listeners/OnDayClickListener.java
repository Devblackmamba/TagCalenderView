package com.android.tagcalender.listeners;

import com.android.tagcalender.EventDay;

/**
 * This interface is used to handle clicks on calendar cells
 * <p>
 * Created by Mateusz Kornakiewicz on 23.05.2017.
 */

public interface OnDayClickListener {
    void onDayClick(EventDay eventDay);
}
