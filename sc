<!doctype html>
<html lang="ru">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Seller Center</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  </head>
  <body>
    <div class="container my-5">
      <div class="row my-5">
        <div class="col">
          <div class="card">
            <div class="card-header">
              Пояснения
            </div>
            <div class="card-body">
              <p class="lead">Цифры случайные, не стоит пытаться посчитать. Это эскиз раздела финансов на странице заказа в ЛК продавца.</p>
              <p>Тут не пример явной верстки, хотя она жмется по брикпоинтам конечно. Тут именно эскиз. Ну, или прототип. Задача&nbsp;&ndash; предложить удобный, краткий и максимально информативный формат раздела финансов внутри заказа в ЛК продавца. Так как куча вопросов со всех сторон.</p>
              <ol class="mb-0">
                <li>Вся информация по расчетам в заказе, без выгрузок отчетов.</li>
                <li>Нулевые значения тоже показывать, чтобы не было сомнений. Промо тоже, просто при нуле одна строка с 0,00.</li>
                <li>Легко понятная калькуляция со <em>всеми</em> транзакциями по заказу.</li>
                <li>Отображение также процентов, а не просто сумм транзакций.</li>
                <li>Действительный порядок транзакций, чтобы явно было понятно из чего что вычетается, а не просто некие, <em>часто кривые</em>, итоги.</li>
                <li>Почему блок возвратов после трекинга? Про деньги&nbsp;&ndash; все рядом нужно. Модаль или нет&nbsp;&ndash; не суть. Но модаль проще по нескольким причинам.</li>
                <li>Расчеты: от какой стоимости берется комиссия за размещение? И кто ее возвращает покупателю по спору: Али или продавец?</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      <h4 class="mt-3">Стоимость заказа</h4>
      <div class="row align-items-center justify-content-left py-2">
        <div class="col-md-3">
          <p class="mb-0">Стоимость товаров</p>
        </div>
        <div class="col-md-2 text-md-end">
          <p class="mb-0">1 000,00 ₽</p>
        </div>
        <div class="col-md-auto">
          <p class="mb-0">&nbsp;</p>
        </div>
      </div>
      <div class="row align-items-center justify-content-left py-2 border-top">
        <div class="col-md-3">
          <p class="mb-0">Стоимость доставки</p>
        </div>
        <div class="col-md-2 text-md-end">
          <p class="mb-0">+100,00 ₽</p>
        </div>
        <div class="col-md-auto">
          <p class="mb-0">&nbsp;</p>
        </div>
      </div>
      <div class="row align-items-center justify-content-left py-2 border-top">
        <div class="col-md-3">
          <p class="mb-0">Продвижение магазина</p>
        </div>
        <div class="col-md-2 text-md-end">
          <p class="mb-0 text-danger">-25,00 ₽</p>
        </div>
        <div class="col-md-auto">
          <p class="mb-0"><a href="#" title="Посмотреть акцию" target="_blank" class="text-body">Предложение золотых монет</a>.</p>
        </div>
      </div>
      <div class="row align-items-center justify-content-left py-2 border-top">
        <div class="col-md-3">
          <p class="mb-0">Продвижение магазина</p>
        </div>
        <div class="col-md-2 text-md-end">
          <p class="mb-0 text-danger">-25,00 ₽</p>
        </div>
        <div class="col-md-auto">
          <p class="mb-0"><a href="#" title="Посмотреть акцию" target="_blank" class="text-body">Купоны магазина</a>.</p>
        </div>
      </div>
      <div class="row align-items-center justify-content-left py-2 border-top">
        <div class="col-md-3">
          <p class="mb-0">Общая стоимость</p>
        </div>
        <div class="col-md-2 text-md-end">
          <p class="mb-0">=1 050,00 ₽</p>
        </div>
        <div class="col-md-auto">
          <p class="mb-0">&nbsp;</p>
        </div>
      </div>
      <h4 class="mt-3">Расчеты по заказу</h4>
      <div class="row align-items-center justify-content-left py-2">
        <div class="col-md-3">
          <p class="mb-0">Оплата от покупателя</p>
        </div>
        <div class="col-md-2 text-md-end">
          <p class="mb-0">1 050,00 ₽</p>
        </div>
        <div class="col-md-auto">
          <p class="mb-0"><a href="#" title="Посмотреть баланс" target="_blank" class="text-body">Платёжная система AliExpress</a>, 07.09.2022, 7:55.</p>
        </div>
      </div>
      <div class="row align-items-center justify-content-left py-2 border-top">
        <div class="col-md-3">
          <p class="mb-0">Комиссия за товар, 8&nbsp;%</p>
        </div>
        <div class="col-md-2 text-md-end">
          <p class="mb-0 text-danger">-80,00 ₽</p>
        </div>
        <div class="col-md-auto">
          <p class="mb-0"><a href="#" title="Посмотреть комиссии по категориям" target="_blank" class="text-body">Комиссии размещения товаров</a>.</p>
        </div>
      </div>
      <div class="row align-items-center justify-content-left py-2 border-top">
        <div class="col-md-3">
          <p class="mb-0">Комиссия за доставку, 100 %</p>
        </div>
        <div class="col-md-2 text-md-end">
          <p class="mb-0 text-danger">-100,00 ₽</p>
        </div>
        <div class="col-md-auto">
          <p class="mb-0">&nbsp;</p>
        </div>
      </div>
      <div class="row align-items-center justify-content-left py-2 border-top">
        <div class="col-md-3">
          <p class="mb-0">Стоимость логистики</p>
        </div>
        <div class="col-md-2 text-md-end">
          <p class="mb-0 text-danger">-159,00 ₽</p>
        </div>
        <div class="col-md-auto">
          <p class="mb-0"><a href="#" title="Посмотреть зоны доставки" target="_blank" class="text-body">Зона доставки</a> по РФ № 1.</p>
        </div>
      </div>
      <div class="row align-items-center justify-content-left py-2 border-top">
        <div class="col-md-3">
          <p class="mb-0">Стоимость логистики возврата</p>
        </div>
        <div class="col-md-2 text-md-end">
          <p class="mb-0 text-danger">-216,00 ₽</p>
        </div>
        <div class="col-md-auto">
          <p class="mb-0">Тариф <a href="#" title="Посмотреть тариф клиентсокго возврата" target="_blank" class="text-body">клиентсокго возврата</a>.</p>
        </div>
      </div>
      <div class="row align-items-center justify-content-left py-2 border-top">
        <div class="col-md-3">
          <p class="mb-0">Возврат средств покупателю</p>
        </div>
        <div class="col-md-2 text-md-end">
          <p class="mb-0 text-danger">-200,00 ₽</p>
        </div>
        <div class="col-md-auto">
          <p class="mb-0"><a class="text-decoration-none btn-sm btn btn-outline-dark" data-bs-toggle="modal" data-bs-target="#returnListModal">Смотреть</a></p>
          <div class="modal fade" id="returnListModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
              <div class="modal-content">
                <div class="modal-header">
                  <h5 class="modal-title" id="exampleModalLabel">Список возвратов</h5>
                  <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Закрыть"></button>
                </div>
                <div class="modal-body">
                  Перечень возвратов
                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-outline-dark" data-bs-dismiss="modal">Закрыть</button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="row align-items-center justify-content-left py-2 border-top">
        <div class="col-md-3">
          <p class="mb-0">Расчётная выплата</p>
        </div>
        <div class="col-md-2 text-md-end">
          <p class="mb-0">=55,00 ₽</p>
        </div>
        <div class="col-md-auto">
          <p class="mb-0">&nbsp;</p>
        </div>
      </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
  </body>
</html>
