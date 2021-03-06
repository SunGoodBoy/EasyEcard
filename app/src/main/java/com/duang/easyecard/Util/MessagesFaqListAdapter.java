package com.duang.easyecard.Util;

import android.content.Context;

import com.duang.easyecard.Model.FaqItem;
import com.duang.easyecard.R;

import java.util.List;

/**
 * Created by MrD on 2016/3/28.
 */
public class MessagesFaqListAdapter extends CommonAdapter<FaqItem> {

    public MessagesFaqListAdapter(Context context, List<FaqItem> datas, int itemLayoutId) {
        super(context, datas, itemLayoutId);
    }

    @Override
    public void convert(ViewHolder holder, FaqItem faqItem) {
        holder
                .setText(R.id.messages_faq_list_item_title, faqItem.getTitle())
                .setImageResource(R.id.messages_faq_list_item_arrow_img,
                        R.drawable.ic_keyboard_arrow_right_black_24dp);
    }
}
