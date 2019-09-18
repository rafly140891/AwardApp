package com.example.awardapp.model;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.awardapp.R;

public class ItemCardsAdapter extends RecyclerView.Adapter<ItemCardsAdapter.ItemCardsViewHolder> {

    private ItemCards[] dataList;

    public ItemCardsAdapter(ItemCards[] dataList) {
        this.dataList = dataList;
    }

    @Override
    public ItemCardsViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_item, parent, false);
        return new ItemCardsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemCardsViewHolder holder, int position) {
        final ItemCards itemCards = dataList[position];

        holder.txtVoucher.setText(dataList[position].getVoucherAwards());
        holder.txtPoin.setText(dataList[position].getPoinAwards());
        holder.txtGiftCard.setText(dataList[position].getGiftAwards());

        if (holder.txtVoucher.getText().toString().equals("Products")) {
            holder.cvTypeAwardCard.setCardBackgroundColor(Color.parseColor("#FF9800"));
        }
    }

    @Override
    public int getItemCount() {
        return dataList.length;
    }

    public class ItemCardsViewHolder extends RecyclerView.ViewHolder {

        private TextView txtVoucher, txtPoin, txtGiftCard;
        private CardView cvTypeAwardCard;

        public ItemCardsViewHolder(View itemView) {
            super(itemView);

            this.txtVoucher = itemView.findViewById(R.id.txtView_typeAward_items);
            this.txtPoin = itemView.findViewById(R.id.txtView_poinAward_items);
            this.txtGiftCard = itemView.findViewById(R.id.txtView_nameAward_items);
            this.cvTypeAwardCard = itemView.findViewById(R.id.cardView_typeAward_items);

        }
    }
}
