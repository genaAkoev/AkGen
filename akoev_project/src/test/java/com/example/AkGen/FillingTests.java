package com.example.AkGen;

import com.example.AkGen.entity.Category;
import com.example.AkGen.entity.Product;
import com.example.AkGen.interfacesDAO.CategoryRepository;
import com.example.AkGen.interfacesDAO.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class FillingTests {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void createCategories(){

        // ОСНОВНЫЕ КАТЕГОРИИ
        Category pizza = new Category("Пицца");
        Category rolls = new Category("Роллы");
        Category burgers = new Category("Бургеры");
        Category drinks = new Category("Напитки");

        //categoryRepository.save(pizza);
        categoryRepository.saveAll(Arrays.asList(rolls, burgers, drinks));
    }


    @Test
    public void addSubcategories(){

        // Подкатегории "Роллы"
        long id_category = categoryRepository.findByName("Роллы").getId();
        Category classic_rolls = new Category("Классические роллы", id_category);
        Category backed_rolls = new Category("Запеченные роллы", id_category);
        Category sweet_rolls = new Category("Сладкие роллы", id_category);
        Category sets = new Category("Наборы", id_category);

        // Подкатегории "Бургеры"
        id_category = categoryRepository.findByName("Бургеры").getId();
        Category classic_burgers = new Category("Классические бургеры", id_category);
        Category spicy_burgers = new Category("Острые бургеры", id_category);

        // Подкатегории "Напитки"
        id_category = categoryRepository.findByName("Напитки").getId();
        Category carbonated_drinks = new Category("Газированные напитки", id_category);
        Category energy_drinks = new Category("Энергетические напитки", id_category);
        Category juices = new Category("Соки", id_category);
        Category other = new Category("Другие", id_category);

        categoryRepository.saveAll(Arrays.asList(classic_rolls, backed_rolls, sweet_rolls, sets,
                classic_burgers, spicy_burgers, carbonated_drinks, energy_drinks, juices, other));

    }

    @Test
    public void addProducts(){

        // Товары категории "Пицца"
        Product salmon_pizza = new Product(categoryRepository.findByName("Пицца"), "Пицца с лососем",
                "Филе лосося, сыры моцарелла и креметта, соусы Песто и сливочный, томаты черри", 549.0);
        Product asian_chick_pizza = new Product(categoryRepository.findByName("Пицца"), "Пицца \"Азиатский цыпленок\"",
                "Копченый цыпленок, моцарелла, соусы томатный и кисло-сладкий", 389.0);
        Product caesar_pizza = new Product(categoryRepository.findByName("Пицца"), "Пицца \"Цезарь\"",
                "Отборные креветки, сыры моцарелла и пармезан, томаты черри, соусы цезарь и сливочный", 549.0);
        Product italian_pizza = new Product(categoryRepository.findByName("Пицца"), "Итальянская пицца",
                "Запеченная пепперони, шампиньоны, моцарелла, маслины, томаты и итальянские травы", 439.0);
        Product cabonara_pizza = new Product(categoryRepository.findByName("Пицца"), "Пицца \"Кабонара\"",
                "Бекон, моцарелла, томаты, креметта, сыр пармезан, лук и чеснок", 499.0);


        // Товары категории "Роллы"
              // Подкатегория "Классические роллы"
              Product mac_rolls = new Product(categoryRepository.findByName("Классические роллы"), "Мак-роллы",
                      "500г риса, 150г тунца, 150г лосося и 1 огурец", 220.0);
              Product philadelphia_rolls = new Product(categoryRepository.findByName("Классические роллы"), "Филадельфия роллы",
                      "500г риса, 150г красной рыбы, 100г икры тобико, 135г сыра Филадельфия и 1 крупный огурец", 210.0);
              Product california_rolls = new Product(categoryRepository.findByName("Классические роллы"), "Калифорния роллы",
                      "450г риса, 250г мяса краба, 120г японского майонеза, 125г икры тобико и 1 огурец", 175.0);
              Product in_yan_rolls = new Product(categoryRepository.findByName("Классические роллы"), "Инь-янь роллы",
                      "550г риса, 230г куриного филе, 150г сливочного сыра, 200г кунжута и 1 огурец", 160.0);


        // Подкатегория "Запеченные роллы"
              Product chicken_tempura = new Product(categoryRepository.findByName("Запеченные роллы"),"Темпура с курицей",
                      "450г риса, 180г крабового мяса, 240г лосося, 120г огурцов", 225.0);
              Product mussels_tempura = new Product(categoryRepository.findByName("Запеченные роллы"),"Темпура с мидиями",
                      "420г риса, 150г творожного сыра, 300г мидий, 3 яйца, 3ст.л. молока", 240.0);
              Product tofu = new Product(categoryRepository.findByName("Запеченные роллы"),"Тофу",
                      "300г риса, 400г тофу, 120г майонеза, 40г соус чили, 200мл соевого соуса", 235.0);


              // Подкатегория "Сладкие роллы"
              Product bounty_rolls = new Product(categoryRepository.findByName("Сладкие роллы"), "Баунти роллы",
                      "6шт блинов, 280г сливочного сыра,0.5 шоколад молочный, 0.5 шоколад темный, 1шт манго", 210.0);
              Product marmalade_rolls = new Product(categoryRepository.findByName("Сладкие роллы"), "Мармеладные роллы",
                      "6шт тонких блинов, 180г сыр Филадельфия, 80г сахарной пудры, 100г фруктового мармелада", 230.0);
              Product fruit_rolls = new Product(categoryRepository.findByName("Сладкие роллы"), "Фруктовые роллы",
                      "100г банана, 120г вишни, 80г киви, 90г ананаса, 100г клубники, 75г яблока", 215.0);
              Product cream_rolls = new Product(categoryRepository.findByName("Сладкие роллы"), "Сливочные роллы",
                      "4порц. тонкого сладкого омлета, 800г сливочного сыра, 90г сахарной пудры, 0.25ст.л. клубничного сиропа", 180.0);


              // Подкатегория "Наборы"
              Product set_weekend = new Product(categoryRepository.findByName("Наборы"), "Сет \"Вечеринка\"",
                      "Вес: 800г, Состав: Темпура с мидиями, Инь-Янь и Калифорния",699.0);
              Product set_bombastic = new Product(categoryRepository.findByName("Наборы"), "Сет \"Бомбический\"",
                      "Вес: 1000г, Состав: Тофу, Мак-роллы и Темпура с курицей",1090.0);
              Product set_sweet_gourmet = new Product(categoryRepository.findByName("Наборы"), "Сет \"Сладкий гурман\"",
                      "Вес: 1450, Состав: Баунти, Мармеладные, Фруктовые и Сливочные",1110.0);

        // Товары категории "Бургеры"
              // Подкатегория "Классические бургеры"
              Product burger_fish = new Product(categoryRepository.findByName("Классические бургеры"), "Бургер-рыба",
                      "Рыба в кляре с маринованным огурчиком, листом салата под соусом Терияки в пшеничной булочке",259.0);
              Product burger_pork = new Product(categoryRepository.findByName("Классические бургеры"), "Бургер-свинина",
                      "Свинина жареная на гриле с маринованным огурчиком, листом салата и сыром чеддер, под фирменным соусом в пшеничной булочке",259.0);
              Product burger_veal = new Product(categoryRepository.findByName("Классические бургеры"), "Бургер-телятина",
                      "Телятина жареная на гриле со свежим томатом, листом салата под пикантным соусом Свит-Чили в пшеничной булочке",329.0);
              Product burger_chicken = new Product(categoryRepository.findByName("Классические бургеры"), "Бургер-курица",
                      "Куриное филе жареное на гриле со свежим томатом, листом салата и сыром чеддер под Медово-Горчичным соусом в пшеничной булочке.",249.0);

              // Подкатегория "Острые бургеры"
              Product burger_big_tasty = new Product(categoryRepository.findByName("Острые бургеры"), "Бургер \"Биг Тейсти\"",
                      "Острый с бифштексом из 100% рубленой говядины, сыром Эмменталь, пикантным соусом Чураско и знаменитым соусом с дымком", 259.0);
              Product burger_ham = new Product(categoryRepository.findByName("Острые бургеры"), "Бургер \"ГАМ\"",
                      "Сочная куриная котлета в хрустящей панировке, зеленые листья салата Айсберг и новый пикантный острый соус.", 115.0);
              Product burger_cheese = new Product(categoryRepository.findByName("Острые бургеры"), "Бургер \"ЧИЗ\"",
                      "Рубленый бифштекс из натуральной говядины, с ломтиком сыра «Чеддер», острым кетчупом, горчицей, перцом чили, луком и маринованными огурчиками", 168.0);


        // Товары категории "Напитки"
              // Подкатегория "Газированные напитки"
              Product coca_cola = new Product(categoryRepository.findByName("Газированные напитки"), "Coca-cola",
                      "Объем: 2 л, Энергетическая ценность: 42 ккал/100г, Углеводы: 11 г/100г", 74.0);
              Product sprite = new Product(categoryRepository.findByName("Газированные напитки"), "Sprite",
                      "Объем: 1.5 л, Энергетическая ценность: 10 ккал/100г, Углеводы: 2 г/100г", 119.0);
              Product fanta = new Product(categoryRepository.findByName("Газированные напитки"), "Fanta",
                      "Объем: 1.5 л, Энергетическая ценность: 33 ккал/100г, Углеводы: 8 г/100г", 89.0);
              Product pepsi = new Product(categoryRepository.findByName("Газированные напитки"), "Pepsi",
                      "Объем: 2 л, Энергетическая ценность: 45 ккал/100г, Углеводы: 12 г/100г", 69.0);
              Product mirinda = new Product(categoryRepository.findByName("Газированные напитки"), "Mirinda",
                      "Объем: 1.5 л, Энергетическая ценность: 27 ккал/100г, Углеводы: 7 г/100г", 80.0);
              Product seven_up = new Product(categoryRepository.findByName("Газированные напитки"), "7Up",
                      "Объем: 2 л, Энергетическая ценность: 30 ккал/100г, Углеводы: 8 г/100г", 100.0);


              // Подкатегория "Энергетические напитки"
              Product burn_original = new Product(categoryRepository.findByName("Энергетические напитки"), "Burn оригинал",
                      "Объем: 449 мл, Пищевая ценность: 55 ккал/100г",85.0);
              Product burn_AppleKiwi = new Product(categoryRepository.findByName("Энергетические напитки"), "Burn яблоко-киви",
                      "Объем: 449 мл, Пищевая ценность: 50 ккал/100г",106.0);
              Product adrenaline = new Product(categoryRepository.findByName("Энергетические напитки"), "Adrenaline",
                      "Объем: 250 мл, Пищевая ценность: 52 ккал/100г",74.0);


              // Подкатегория "Соки"
              Product rich = new Product(categoryRepository.findByName("Соки"), "Rich",
                      "Объем: 1 л, Вкус: Ананас, Энергетическая ценность: 52 ккал/100г", 126.0);
              Product dobriy = new Product(categoryRepository.findByName("Соки"), "Добрый",
                      "Объем: 2 л, Вкус: Яблоко, Энергетическая ценность: 46 ккал/100г", 109.0);
              Product j7 = new Product(categoryRepository.findByName("Соки"), "J-7",
                      "Объем: 0.97 л, Вкус: Апельсин, Энергетическая ценность: 44 ккал/100г", 85.0);


              // Подкатегория "Другие"
              Product coffee = new Product(categoryRepository.findByName("Другие"), "Кофе", "Латте кофе, взбитое молоко", 110.0);
              Product beer = new Product(categoryRepository.findByName("Другие"), "Пиво", "Светлое, пастеризованное. 4,7% алкоголя", 125.0);
              Product steel_water = new Product(categoryRepository.findByName("Другие"), "Святой источник", "Вода, негазированная", 60.0);

              productRepository.saveAll(Arrays.asList(salmon_pizza, asian_chick_pizza, caesar_pizza, italian_pizza, cabonara_pizza,
                      mac_rolls, philadelphia_rolls, california_rolls, in_yan_rolls, chicken_tempura, mussels_tempura, tofu,
                      bounty_rolls, marmalade_rolls, fruit_rolls, cream_rolls, set_weekend, set_bombastic, set_sweet_gourmet,
                      burger_big_tasty, burger_ham, burger_cheese, burger_fish, burger_pork, burger_veal, burger_chicken,
                      coca_cola, sprite, fanta, pepsi, mirinda, seven_up, burn_original, burn_AppleKiwi, adrenaline, rich,
                      dobriy, j7, coffee, beer, steel_water));

    }
}
