package stockmarket.entity.database;

import stockmarket.entity.Trade;
import java.util.*;

public interface TradeService {

    Trade getTradeByName();

    void addTrade(Trade trade);

    void addTrades(List<Trade> tradeList);

}
