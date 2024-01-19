# language: ru

@all

  Функция: Добавление товара

    Предыстория:
      * открыта страница по адресу "http://localhost:8080/food"
      * открывается меню "Список товаров"

      @correct
      Сценарий: Успешное добавление продукта - сценарий 1
        * выполнено нажатие на "Добавить"
        * открывается окно "Добавление товаров"
        * поле "Наименование" видимо
        * поле "Наименование" заполняется значением  "!\"№;%:?*()_+/ЭЖХЪ,ЮБ12312роффшkjhjksojhiHDhuhUHГРГРои"
        * поле1 "Тип" видимо
        * в поле "Тип" выбирается значение  "Фрукт"
        * чекбокс "Экзотический" видим
        * кнопка "Сохранить" видима
        * выполнено нажатие1 на "Сохранить"



      Сценарий: Успешное добавление продукта - сценарий 2
        * выполнено нажатие на "Добавить"
        * открывается окно "Добавление товаров"
        * поле "Наименование" видимо
        * поле1 "Наименование" заполняется значением  "Вячеслав"
        * поле1 "Тип" видимо
        * в поле1 "Тип" выбирается значение  "Овощ"
        * чекбокс "Экзотический" видим
        * выполнено нажатие на чекбокс"Экзотический"
        * кнопка "Сохранить" видима
        * выполнено нажатие1 на "Сохранить"






