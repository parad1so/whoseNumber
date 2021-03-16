<#import "parts/common.ftlh" as c>

<@c.page>

    <div class="form-row">
        <div class="form-group col-md-6">
            <form method="get" action="/" class="form-inline">
                <input type="text" name="filter" class="form-control" value="${filter?ifExists}" placeholder="Search by number">
                <button type="submit" class="btn btn-primary ml-2">Найти</button>
            </form>
        </div>
    </div>

    <a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
        Добавить новый номер
    </a>
    <div class="collapse" id="collapseExample">
        <div class="form-group mt-3">
            <form method="post" enctype="multipart/form-data">
                <div class="form-group">
                    <input type="text" class="form-control" name="phoneNumber" placeholder="Номер">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" name="text" placeholder="Введите комментарий" />
                </div>
                <input type="hidden" name="_csrf" value="${_csrf.token}" />
                <div class="form-group">
                    <button type="submit" class="btn btn-primary">Добавить</button>
                </div>
            </form>
        </div>
    </div>


    <div class="card-columns">
        <#list messages as message>
        <div class="card my-3">
        ${message.phoneNumber}
            <div class="m-2">
                <span>${message.text}</span>
            </div>
            <div class="card-footer text-muted">
                ${message.author}
            </div>
        </div>
    <#else>
    Нет Комментариев
</#list>
</@c.page>