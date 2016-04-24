package stockmarket.entity.database;

import stockmarket.entity.Trade;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TradeServiceImpl implements TradeService {

    Map<String, Trade> store = new HashMap<>();
    static final ExecutorService executorService = Executors.newFixedThreadPool(1000);


    @Override
    public Trade getTradeByName() {
        return null;
    }

    @Override
    public void addTrade(Trade trade) {
        store.put(generateID(), trade);
    }

    private String generateID() {
         return "";
    }

    @Override
    public void addTrades(List<Trade> tradeList) {

        tradeList.stream()
                .forEach((t) -> executorService.submit( () -> addTrade(t) ));

    }
}
